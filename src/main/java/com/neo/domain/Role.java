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
public class Role extends BaseEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8595389433369806994L;

	public Role() {
    }
	
   
	@Id
	@GeneratedValue
    private Long id;
    private String name;
    private String functionIds;

    public Role(String name) {
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getFunctionIds() {
		return functionIds;
	}

	public void setFunctionIds(String functionIds) {
		this.functionIds = functionIds;
	}

	public Role(Long id, String name, String functionIds) {
		super();
		this.id = id;
		this.name = name;
		this.functionIds = functionIds;
	}
	
	
}