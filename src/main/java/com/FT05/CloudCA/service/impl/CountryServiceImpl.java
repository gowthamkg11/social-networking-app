package com.FT05.CloudCA.service.impl;

import com.FT05.CloudCA.model.Country;
import com.FT05.CloudCA.repository.CountryRepository;
import com.FT05.CloudCA.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    /**
     * Save a country.
     *
     * @param country the entity to save
     * @return the persisted entity
     */
    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    /**
     * Get all the countries.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Country> findAll() {
        return countryRepository.findAll();
    }


    /**
     * Get one country by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Country   findOne(Long id) {
        return countryRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class NotFoundException extends RuntimeException{
    }
    /**
     * Delete the country by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }
}


