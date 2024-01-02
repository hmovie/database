package com.hmovie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@Data
public class AbstractEntity {
    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_date")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;
}
