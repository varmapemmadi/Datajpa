package org.micro.datajpa.entity;

import jakarta.persistence.*;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "socialProfile")
   // @JoinColumn(name="social_user")
    private SocialUser user;
}
