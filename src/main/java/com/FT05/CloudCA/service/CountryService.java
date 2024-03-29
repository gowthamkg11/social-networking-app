package com.FT05.CloudCA.service;


import com.FT05.CloudCA.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    /**
     * Save a country.
     *
     * @param country the entity to save
     * @return the persisted entity
     */
    Country save(Country country);

    /**
     * Get all the countries.
     *
     * @param
     * @return the list of entities
     */
    List<Country> findAll();


    /**
     * Get the "id" country.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Country findOne(Long id);

    /**
     * Delete the "id" country.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
