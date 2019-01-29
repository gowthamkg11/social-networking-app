package com.FT05.CloudCA.model;

import javax.persistence.*;

@Entity
@Table(name="smscinfo")
public class SMSCInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="smsc")
    private String smsc;

    @Column(name="owner")
    private String owner;

    @Column(name="country")
    private String country;
}
