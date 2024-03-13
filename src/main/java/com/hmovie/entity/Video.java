package com.hmovie.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "video")
@Data
public class Video extends AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "video_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
    @Column(name = "duration")
    private Date duration;
    @Column(name = "rating")
    private String rating;
}
