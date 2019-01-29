package com.FT05.CloudCA.repository;

import com.FT05.CloudCA.model.SMSCInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSCInfoRepository extends JpaRepository<SMSCInfo,Long> {
}
