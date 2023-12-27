package com.sb_community.sb_post.domain;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_num;

    @Column(length=64, nullable = false, unique = true)
    private String user_id;

    @Column(length=256, nullable = false)
    private String user_pwd;

}
