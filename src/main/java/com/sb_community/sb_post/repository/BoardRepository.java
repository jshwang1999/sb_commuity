package com.sb_community.sb_post.repository;

import com.sb_community.sb_post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
