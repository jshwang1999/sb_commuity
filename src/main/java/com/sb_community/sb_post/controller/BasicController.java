package com.sb_community.sb_post.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Log4j2
@EnableJpaAuditing // AuditingEntityListner의 활성화

public class BasicController {
@GetMapping("/test")
public void test(Model model){
    log.info("This is test.");
    model.addAttribute("msg", "This is test......");
}

}
