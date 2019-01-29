package com.FT05.CloudCA.repository;


import com.FT05.CloudCA.model.Connector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectorRepository extends JpaRepository<Connector, Long> {
}
