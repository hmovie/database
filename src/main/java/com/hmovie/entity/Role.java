package com.hmovie.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
@Data
public class Role extends AbstractEntity {
    @Id
    @Column(name = "role_code")
    private String roleCode;
    @Column(name = "role_name")
    private String roleName;
}
