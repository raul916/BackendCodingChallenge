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
@Table(name = "badge")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Badges {
	@Id
	int badge_id;
	String badge_name;
	int badge_cost;
	String badge_dir;
//	int badge_count;
	
	public Badges() {
		super();
	}
	public Badges(int badge_id, String badge_name, int badge_cost, String badge_dir) {
		super();
		this.badge_id = badge_id;
		this.badge_name = badge_name;
		this.badge_cost = badge_cost;
		this.badge_dir = badge_dir;
	}
	
	public int getBadge_id() {
		return badge_id;
	}
	public void setBadge_id(int badge_id) {
		this.badge_id = badge_id;
	}
	public String getBadge_name() {
		return badge_name;
	}
	public void setBadge_name(String badge_name) {
		this.badge_name = badge_name;
	}
	public int getBadge_cost() {
		return badge_cost;
	}
	public void setBadge_cost(int badge_cost) {
		this.badge_cost = badge_cost;
	}
	public String getBadge_dir() {
		return badge_dir;
	}
	public void setBadge_dir(String badge_dir) {
		this.badge_dir = badge_dir;
	}
	@Override
	public String toString() {
		return "Badges [badge_id=" + badge_id + ", badge_name=" + badge_name + ", badge_cost=" + badge_cost + ", badge_dir=" + badge_dir + "]";
	}
}
