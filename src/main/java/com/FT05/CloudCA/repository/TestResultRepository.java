package com.FT05.CloudCA.repository;


import com.FT05.CloudCA.model.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult,Long> {
}
