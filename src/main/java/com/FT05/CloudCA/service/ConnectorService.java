package com.FT05.CloudCA.service;

import com.FT05.CloudCA.model.Connector;

import java.util.List;

public interface ConnectorService {
    /**
     * Save a Connector.
     *
     * @param connector the entity to save
     * @return the persisted entity
     */
    Connector save(Connector connector);

    /**
     * Get all the countries.
     *
     * @param
     * @return the list of entities
     */
    List<Connector> findAll();


    /**
     * Get the "id" Connector.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Connector findOne(Long id);

    /**
     * Delete the "id" Connector.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

