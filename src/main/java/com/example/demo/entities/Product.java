package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("unused")
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String name;
	
	public Product() {
		super();
	}
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
