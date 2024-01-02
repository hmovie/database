package com.hmovie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user_role")
@Data
public class UserRole extends AbstractEntity {
    @Id
    @Column(name = "user_id")
    private Long userId;
    @Id
    @Column(name = "role_code")
    private String roleCode;
}
