package com.neo.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.neo.common.BaseEntity;

/**
 * Created by dello on 2016/7/27.
 */
@Entity
public class UserRole extends BaseEntity  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -606469879965237106L;
	@Id
	@GeneratedValue
    private Long id;
    private Long userId;
    private Long roleId;

    public UserRole(Long id, Long userId, Long roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}