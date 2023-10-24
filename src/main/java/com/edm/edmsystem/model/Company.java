package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "COMPANIES")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "company_address_id")
    private Address companyAddress;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "correspondence_address_id")
    private Address correspondenceAddress;

    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Property> properties;
}
