package com.FT05.CloudCA.repository;


import com.FT05.CloudCA.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRepository extends JpaRepository<TestCase,Long> {
}
