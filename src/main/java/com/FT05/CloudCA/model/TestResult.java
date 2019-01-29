package com.FT05.CloudCA.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="test_result")
public class TestResult {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="received_sourceId")
    private String source_id;

    @Column(name="received_text")
    private String text;

    @Column(name="received_time")
    private Date time;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = TestResult.class)
    @JoinColumn(unique = true)
    public SMSCInfo smscInfo;

    @Column(name="received_status")
    private String status;

    @Column(name="latency")
    private int latency;

}
