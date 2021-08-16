package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "emp")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

	@Id
	String email_id;
	String name;
	String dept;
	String position;
	String bio;
	int kudos_points;
	int kudos_spent;
	
	public Employee() {
		super();
	}
	public Employee(String email_id, String name, String dept, String position, String bio, int kudos_points, int kudos_spent) {
		super();
		this.email_id = email_id;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.bio = bio;
		this.kudos_points = kudos_points;
		this.kudos_spent = kudos_spent;
	}
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getKudos_points() {
		return kudos_points;
	}
	public void setKudos_points(int kudos_points) {
		this.kudos_points = kudos_points;
	}
	
	
	public int getKudos_spent() {
		return kudos_spent;
	}
	public void setKudos_spent(int kudos_spent) {
		this.kudos_spent = kudos_spent;
	}
	@Override
	public String toString() {
		return "Employee [email_id=" + email_id + ", name=" + name + ", dept=" + dept + ", position=" + position
				+ ", bio=" + bio + ", kudos_points=" + kudos_points + ", kudos_spent=" + kudos_spent + "]";
	}
}
