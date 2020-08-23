package com.aleksa.teams;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Long id;
	private String name;
	private Long leaderID;

	protected Teams() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getLeaderID() {
		return leaderID;
	}
	public void setLeaderID(Long leaderID) {
		this.leaderID = leaderID;
	}

}
