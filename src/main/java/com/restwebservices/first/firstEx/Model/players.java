package com.restwebservices.first.firstEx.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class players {
@Id 
private long playerId;
private String name;
private int Score;
public long getPlayerId() {
	return playerId;
}
public void setPlayerId(long playerId) {
	this.playerId = playerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return Score;
}
public void setScore(int score) {
	Score = score;
}
public players() {
	super();
	// TODO Auto-generated constructor stub
}
public players(long playerId, String name, int score) {
	super();
	this.playerId = playerId;
	this.name = name;
	Score = score;
}

}