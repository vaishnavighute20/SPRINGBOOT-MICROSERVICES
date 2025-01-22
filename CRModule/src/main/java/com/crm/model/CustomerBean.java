package com.crm.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerBean {
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
    @Pattern(regexp="^[a-z][a-z0-9#@!]*")
	@Size(min=8,max=15)
	private String password;
    @Min(21)
    @Max(35)
    @NotNull
	private Integer age;
    @NotNull
	private Gender gender;
    @NotNull
    @Past
	@DateTimeFormat(pattern="yyyy-MM--dd")
    private Date dateOfBirth;
    @NotNull
	private Long ContactNumber;
    @NotEmpty
	private String country;
    private Map<String,String> countries=new HashMap<>();
    public CustomerBean() {
    	countries.put("INDIA", "india");
    	countries.put("AUSTRALIA", "australia");
    	countries.put("USA", "usa");
    }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	public CustomerBean(@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty @Email String email,
			@NotEmpty @Pattern(regexp = "^[a-z][a-z0-9#@!]*") @Size(min = 8, max = 15) String password,
			@Min(21) @Max(35) @NotNull Integer age, @NotNull Gender gender, @NotNull @Past Date dateOfBirth,
			@NotNull Long contactNumber, @NotEmpty String country, Map<String, String> countries) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		ContactNumber = contactNumber;
		this.country = country;
		this.countries = countries;

}
}