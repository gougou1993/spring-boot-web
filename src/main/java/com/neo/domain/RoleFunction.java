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
public class RoleFunction extends BaseEntity  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6235257752136714283L;
	@Id
	@GeneratedValue
    private Long Id;
    private Long roleId;
    private Long functionId;
    private int status;

    public RoleFunction() {
    }

    public RoleFunction(Long id, Long roleId, Long functionId, int status) {
        this.Id = id;
        this.roleId = roleId;
        this.functionId = functionId;
        this.status = status;
    }
    @Id
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
