package com.neo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.neo.common.BaseEntity;


@Entity
public class Functions extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -574067253591898890L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long parentId;
	private String url;
	private Integer serialNum;
	private Integer accordion;
	
	public Integer getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(Integer serialNum) {
		this.serialNum = serialNum;
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getserialNum() {
		return serialNum;
	}
	public void setserialNum(Integer serialNum) {
		this.serialNum = serialNum;
	}
	public Integer getAccordion() {
		return accordion;
	}
	public void setAccordion(Integer accordion) {
		this.accordion = accordion;
	}
	public Functions() {
		super();
	}
	public Functions(String name, Long parentId, String url, Integer serialNum, Integer accordion, Long id) {
		super();
		this.name = name;
		this.parentId = parentId;
		this.url = url;
		this.serialNum = serialNum;
		this.accordion = accordion;
		this.id = id;
	}
	

}
