package com.sb_community.sb_post.repository;

import com.sb_community.sb_post.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testBoardInsert(){
        Board board = Board.builder().board_name("자유게시판").board_desc("자유롭게 소통하는 게시판입니다.").build();
        Board result = boardRepository.save(board);
//        log.info("Board number: " + result.getBoard_num());
    }


}
