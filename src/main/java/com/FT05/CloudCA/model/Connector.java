package com.FT05.CloudCA.model;

import javax.persistence.*;


@Entity
@Table(name="connectors")
public class Connector {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="connector_name")
    private String connectorName;

    @Column(name="connector_type")
    private String connectorType;

    @Column(name="connector_address")
    private String connectorAddress;

    @Column(name="connector_account")
    private String connectorAccount;

    @Column(name="connector_pass_key")
    private String connectorPassKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public String getConnectorAddress() {
        return connectorAddress;
    }

    public void setConnectorAddress(String connectorAddress) {
        this.connectorAddress = connectorAddress;
    }

    public String getConnectorAccount() {
        return connectorAccount;
    }

    public void setConnectorAccount(String connectorAccount) {
        this.connectorAccount = connectorAccount;
    }

    public String getConnectorPassKey() {
        return connectorPassKey;
    }

    public void setConnectorPassKey(String connectorPassKey) {
        this.connectorPassKey = connectorPassKey;
    }
}
