package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String dateOfAdmission;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    protected Client() {}

    public Client(String clientName, String email, String dateOfAdmission, Advisor advisor) {
        this.clientName = clientName;
        this.email = email;
        this.dateOfAdmission = dateOfAdmission;
        this.advisor = advisor;
    }

    public long getClientId() { return clientId; }
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDateOfAdmission() { return dateOfAdmission; }
    public void setDateOfAdmission(String dateOfAdmission) { this.dateOfAdmission = dateOfAdmission; }
    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
}
