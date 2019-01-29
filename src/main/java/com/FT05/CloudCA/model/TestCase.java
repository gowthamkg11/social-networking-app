package com.FT05.CloudCA.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="singlesms_testcase")
public class TestCase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name = "source_id")
    private String sourceId;


    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Country.class)
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Connector.class)
    @JoinColumn(name = "connector_id")
    private Connector connector;


    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Operator.class)
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @Column(name = "device")
    private String device;

    @Column(name="text")
    private String text;

    @Column(name = "sent_at")
    private Date sentTime;

    @Column(name="encoding")
    private String encoding;

    @Column(name="hashvalue")
    private String hashvalue;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = TestResult.class)
    @JoinColumn(unique = true)
    public TestResult testResult;







}
