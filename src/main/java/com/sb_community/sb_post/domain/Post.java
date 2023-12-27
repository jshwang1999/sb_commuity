package com.sb_community.sb_post.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(ComplexId.class)
public class Post extends SuperEntity {

    // 기본키: 게시판 번호 + 게시글 번호(복합키)
    // why? 게시판은 상호 배타적인 관계이고, 게시글 번호를 따로 count하므로 게시글 번호만으로는 게시글을 식별할 수 없음
    // 즉, 게시판이 다르다면 게시글 번호가 같은 글이 존재할 수 있다.
    // [A 게시판 - 1번 글], [B 게시판 - 1번 글], 두 글은 서로 다른 게시판에 작성되었음

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_num; // 게시글 번호

    @Id
    @ManyToOne
    @JoinColumn(name = "board_num", referencedColumnName = "board_num")
    private Board board_num;  // 게시판 번호

    @ManyToOne
    @JoinColumn(name = "user_num", referencedColumnName = "user_num")
    private User user_num; // 글 작성자 번호(검색용)

    @ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "user_id")
    private User author; // 글 작성자명

    @Column(length = 300, nullable = false)
    private String post_title; // 글 제목

    @Column(columnDefinition = "TEXT", nullable = false)
    private String post_content; // 글 내용

    // 글 작성시간, 수정시간은 SuperEntity 상속을 통해 해결

    // 첨부파일 관련 필드도 추가해야함

}
