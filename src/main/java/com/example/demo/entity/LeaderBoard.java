package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


public class LeaderBoard {
	
	String name;
	int kudos_spent;
	
	public LeaderBoard(String name, int kudos_spent) {
		super();
		this.name = name;
		this.kudos_spent = kudos_spent;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getKudos_spent() {
		return kudos_spent;
	}

	public void setKudos_spent(int kudos_spent) {
		this.kudos_spent = kudos_spent;
	}

}
