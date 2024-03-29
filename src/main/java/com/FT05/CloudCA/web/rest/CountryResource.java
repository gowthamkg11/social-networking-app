package com.FT05.CloudCA.web.rest;


import com.FT05.CloudCA.model.Country;
import com.FT05.CloudCA.service.CountryService;
import com.FT05.CloudCA.web.rest.Util.HeaderUtil;
import com.FT05.CloudCA.web.rest.errors.BadRequestAlertException;
import org.aspectj.bridge.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;
import static org.hibernate.id.IdentifierGenerator.ENTITY_NAME;

@RestController
@RequestMapping("/v1")
public class CountryResource {
    private final Logger log = LoggerFactory.getLogger(CountryResource.class);
    private final CountryService countryService;
    public CountryResource(CountryService countryService) {
        this.countryService = countryService;
    }

    /**
     * POST  /countries : Create a new country.
     *
     * @param country the country to create
     * @return the ResponseEntity with status 201 (Created) and with body the new country, or with status 400 (Bad Request) if the country has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/countries")
    public ResponseEntity<Country> createCountry(@Valid @RequestBody Country country) throws URISyntaxException {
        log.debug("REST request to save Country : {}", country);
        if (country.getId() != null) {
            throw new BadRequestAlertException("A new country cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Country result = countryService.save(country);
        return ResponseEntity.created(new URI("/v1/countries/" + result.getId()))
                .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
                .body(result);
    }

    /**
     * PUT  /countries : Updates an existing country.
     *
     * @param country the country to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated country,
     * or with status 400 (Bad Request) if the country is not valid,
     * or with status 500 (Internal Server Error) if the country couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/countries")
    public ResponseEntity<Country> updateCountry(@Valid @RequestBody Country country) throws URISyntaxException {
        log.debug("REST request to update Country : {}", country);
        if (country.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Country result = countryService.save(country);
        return ResponseEntity.ok()
                .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, country.getId().toString()))
                .body(result);
    }

    /**
     * GET  /countries : get all the countries.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of countries in body
     */
    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        log.debug("REST request to get a page of Countries");
        List<Country> countries = countryService.findAll();
        return ResponseEntity.ok().body(countries);
    }

    /**
     * GET  /countries/:id : get the "id" country.
     *
     * @param id the id of the country to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the country, or with status 404 (Not Found)
     */
    @GetMapping("/countries/{id}")
    public ResponseEntity<Country> getCountry(@PathVariable Long id) {
        log.debug("REST request to get Country : {}", id);
        Country country = countryService.findOne(id);
        return ResponseEntity.ok().body(country);
    }



    /**
     * DELETE  /countries/:id : delete the "id" country.
     *
     * @param id the id of the country to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/countries/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable Long id) {
        log.debug("REST request to delete Country : {}", id);
        countryService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
