package com.poojashree.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alian {
	@Id
private int  aid;
private String name;
private String tech;

public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Alian [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
}



}
