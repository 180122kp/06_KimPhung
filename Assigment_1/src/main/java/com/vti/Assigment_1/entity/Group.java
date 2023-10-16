package com.vti.Assigment_1.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name = "Group")
public class Group implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true)
	private String name;

	@Column(name = "create_date")
	@Temporal(TemporalType.DATE)
	private Date creatDate;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "Group { " + "ID = " + id + ", Name = '" + name + '\'' + '}';
	}
	}
