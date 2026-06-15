package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio() {}

    public Portfolio(String creationDate, String status, Client client) {
        this.creationDate = creationDate;
        this.status = status;
        this.client = client;
    }

    public long getPortfolioId() { return portfolioId; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}
