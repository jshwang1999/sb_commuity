package com.sb_community.sb_post.repository;

import com.sb_community.sb_post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
