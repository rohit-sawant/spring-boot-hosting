package com.springwalk.sample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Name {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
String firstname;
String lastname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "Name [firstname=" + firstname + ", lastname=" + lastname + "]";
}
public Name(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}
public Name() {
	super();
	// TODO Auto-generated constructor stub
}
public Name(int id, String firstname, String lastname) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
}




}
