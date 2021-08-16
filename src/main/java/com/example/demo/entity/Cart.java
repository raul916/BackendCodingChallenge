package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

public class Cart {
	
	String email_id;
	int kudos_cost;
	List < Integer > badge_id;
	
	public Cart() {
		super();
	}
	public Cart(String email_id, int kudos_cost, List<Integer> badge_id) {
		super();
		this.email_id = email_id;
		this.kudos_cost = kudos_cost;
		this.badge_id = badge_id;
	}
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getKudos_cost() {
		return kudos_cost;
	}
	public void setKudos_cost(int kudos_cost) {
		this.kudos_cost = kudos_cost;
	}
	public List<Integer> getBadge_id() {
		return badge_id;
	}
	public void setBadge_id(List<Integer> badge_id) {
		this.badge_id = badge_id;
	}
	
	@Override
	public String toString() {
		return "Cart [email_id=" + email_id + ", kudos_cost=" + kudos_cost + ", badge_id=" + badge_id + "]";
	}
}
