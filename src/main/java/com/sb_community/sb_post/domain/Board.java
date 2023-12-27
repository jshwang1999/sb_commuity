package com.sb_community.sb_post.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long board_num; // 게시판 번호

    @Column(length = 16, nullable=false, unique = true)
    private String board_name; // 게시판 이름

    private String board_desc; // 게시판 설명
}

