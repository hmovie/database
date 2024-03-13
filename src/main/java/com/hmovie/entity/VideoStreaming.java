package com.hmovie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "video_streaming")
@Data
public class VideoStreaming extends AbstractEntity {

    @Id
    @Column(name = "video_id")
    private Long videoId;

    @Id
    @Column(name = "streaming_url")
    private String streamingUrl;
    
}
