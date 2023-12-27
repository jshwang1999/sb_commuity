package com.sb_community.sb_post.domain;

import jakarta.persistence.*;

// 댓글 엔티티
@Entity
public class Comment extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_num; // 댓글 번호?

    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_id")
    private User user_name; // 댓글 작성자

    @Column(length = 512, nullable = false)
    private String comment_content; // 댓글 내용

    // 댓글 작성시간, 수정시간은 SuperEntity 상속

}
