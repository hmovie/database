package com.hmovie.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "comment")
@Data
public class Comment extends AbstractEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "comment_id")
    private Long commentId;
    @Column(name = "content", columnDefinition = "text not null")
    private String content;
    @Column(name = "parent_id")
    private Long parentId;
}
