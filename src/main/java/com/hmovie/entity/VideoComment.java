package com.hmovie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "video_comment")
@Data
public class VideoComment extends AbstractEntity {
    @Id
    private Long videoId;
    @Id
    private Long commentId;
}
