package com.sb_community.sb_post.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

// 각 엔티티에 공통으로 사용되는 속성을 작성해둔 부모 엔티티
@MappedSuperclass
@EntityListeners(value= { AuditingEntityListener.class })
@Getter
abstract class SuperEntity {

   @CreatedDate
   @Column(name = "regdate", updatable = false)
   private LocalDateTime regDate; // 최초 작성시간


   @LastModifiedDate
   @Column(name = "moddate")
   private LocalDateTime modDate; // 최근 수정시간
}
