package com.bellinfo.cricket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer rating;

	private String playername;
	private int age;
	private String specialization;
	private int noc;
	private int totalruns;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public int getTotalruns() {
		return totalruns;
	}
	public void setTotalruns(int totalruns) {
		this.totalruns = totalruns;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", rating=" + rating + ", playername=" + playername + ", age="
				+ age + ", specialization=" + specialization + ", noc=" + noc + ", totalruns=" + totalruns + "]";
	}
	
	
	
	

}
