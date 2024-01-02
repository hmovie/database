package com.hmovie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "video_category")
@Data
public class VideoCategory extends AbstractEntity {
    @Id
    @Column(name = "video_id")
    private Long videoId;
    @Id
    @Column(name = "category_id")
    private Long categoryId;
}
