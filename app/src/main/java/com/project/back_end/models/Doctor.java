package com.project.back_end.models;

import java.lang.annotation.Inherited;
@Entity
public class Docter
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    
    @NotNull
    @Size(min=3,max=100)
    private String name;
    private String speciality;
    @Email
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @sElementCollection
    private List<String> availableTimes;
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private Strinh phoneNumber;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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
	public List<String> getAvailableTimes() {
		return availableTimes;
	}
	public void setAvailableTimes(List<String> availableTimes) {
		this.availableTimes = availableTimes;
	}
	public Strinh getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Strinh phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
