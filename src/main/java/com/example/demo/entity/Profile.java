package com.example.demo.entity;

import java.util.List;

public class Profile {
	
	Employee e;
//	List < Integer > badge_id;
//	List < String > badge_name;
//	List<Badges> b;
	List <Integer> badge_count;
	
	public Profile() {
		super();
	}
	
	public Profile(Employee e, List<Integer> badge_count) {
		super();
		this.e = e;
//		this.b = b;
		this.badge_count = badge_count;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

//	public List<Badges> getB() {
//		return b;
//	}
//
//	public void setB(List<Badges> b) {
//		this.b = b;
//	}

	public List<Integer> getBadge_count() {
		return badge_count;
	}

	public void setBadge_count(List<Integer> badge_count) {
		this.badge_count = badge_count;
	}

	@Override
	public String toString() {
		return "Profile [e=" + e + ", badge_count=" + badge_count + "]";
	}
	
	
	
}
