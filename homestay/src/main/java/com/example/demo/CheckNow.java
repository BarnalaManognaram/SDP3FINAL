package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Data")
public class CheckNow {
	@Column(name="fname")
private String fname;
@Id
@Column(name="email")
private String email;
@Column(name="addrs")
private String addrs;
@Column(name="city")
private String city;
@Column(name="home")
private String home;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddrs() {
	return addrs;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHome() {
	return home;
}
public void setHome(String home) {
	this.home = home;
}

}
