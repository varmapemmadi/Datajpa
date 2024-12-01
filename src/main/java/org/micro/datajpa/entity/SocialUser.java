package org.micro.datajpa.entity;

import jakarta.persistence.*;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private SocialProfile socialProfile;

}
