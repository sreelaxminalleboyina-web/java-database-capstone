package com.project.back_end.models;

@Entity
public class Admin
{
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull(message="username cannot be null")
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
