package com.example.demo.entity;

import java.io.Serializable;

//@Entity
public class MapTableKey implements Serializable 
{
	String email_id;
	int badge_id;
	
	public MapTableKey() {
		super();
	}
	public MapTableKey(String email_id, int badge_id) {
		super();
		this.email_id = email_id;
		this.badge_id = badge_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getBadge_id() {
		return badge_id;
	}

	public void setBadge_id(int badge_id) {
		this.badge_id = badge_id;
	}
	
	@Override
	public String toString() {
		return "MapTableKey [email_id=" + email_id + ", badge_id=" + badge_id + "]";
	}
}
