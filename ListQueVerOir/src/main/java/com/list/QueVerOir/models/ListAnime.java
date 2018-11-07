package com.list.QueVerOir.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="list_anime")
public class ListAnime implements Serializable{
	
	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String status;
	@NotNull
	private int chapter;
	

	
	public ListAnime(@NotEmpty String name, @NotEmpty String gender, @NotEmpty String status, @NotNull int chapter) {
		this.name = name;
		this.gender = gender;
		this.status = status;
		this.chapter = chapter;
	}
	

	public ListAnime() {
		
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	} 
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getChapter() {
		return chapter;
	}
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
