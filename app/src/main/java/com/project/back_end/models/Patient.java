package com.project.back_end.models;

@Entity
public class Patient
{
private Long Id;
@NotNull
@Size(min = 3, max = 100)
private String name;
@Email
private String email;
private String password;
@Size(max = 255)
private String address;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
