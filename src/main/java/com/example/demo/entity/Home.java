package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

public class Home {
	int kp;
//	List < Integer > badge_id;
//	List < String > badge_name;
//	List < Integer > badge_cost;
//	List<Badges> b;
	List <Integer> badge_count;
	
	public Home() {
		super();
	}
	
	public Home(int kp, List<Integer> badge_count) {
		super();
		this.kp = kp;
//		this.b = b;
		this.badge_count = badge_count;
	}

	public int getKp() {
		return kp;
	}

	public void setKp(int kp) {
		this.kp = kp;
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
		return "Home [kp=" + kp + ", badge_count=" + badge_count + "]";
	}
	
	
	
}
