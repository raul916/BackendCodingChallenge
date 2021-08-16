package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//implements Serializable

//@Data
//@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "mapping_table")
@IdClass(MapTableKey.class)
public class MappingTable
{	
	@Id
	String email_id;
	@Id
	int badge_id;
	int badges_count;

	public MappingTable() {
		super();
	}

	public MappingTable(String email_id, int badge_id, int badges_count) {
		super();
		this.email_id = email_id;
		this.badge_id = badge_id;
		this.badges_count = badges_count;
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

	public int getBadges_count() {
		return badges_count;
	}

	public void setBadges_count(int badges_count) {
		this.badges_count = badges_count;
	}

	@Override
	public String toString() {
		return "MappingTable [email_id=" + email_id + ", badge_id=" + badge_id + ", badges_count=" + badges_count + "]";
	}

}
