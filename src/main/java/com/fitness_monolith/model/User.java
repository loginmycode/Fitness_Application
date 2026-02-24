package com.fitness_monolith.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDateTime createdAt;
	private LocalDateTime updtedAt;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =true)
	@JsonIgnore
	private List<Activity> activities = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =true)
	@JsonIgnore
	private List<Recommendation> recommandation = new ArrayList<>();


	public User(String id, String email, String password, String firstName, String lastName, LocalDateTime createdAt,
			LocalDateTime updtedAt, List<Activity> activities, List<Recommendation> recommandation) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdAt = createdAt;
		this.updtedAt = updtedAt;
		this.activities = activities;
		this.recommandation = recommandation;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdtedAt() {
		return updtedAt;
	}


	public void setUpdtedAt(LocalDateTime updtedAt) {
		this.updtedAt = updtedAt;
	}


	public List<Activity> getActivities() {
		return activities;
	}


	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	public List<Recommendation> getRecommandation() {
		return recommandation;
	}


	public void setRecommandation(List<Recommendation> recommandation) {
		this.recommandation = recommandation;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", createdAt=" + createdAt + ", updtedAt=" + updtedAt + ", activities="
				+ activities + ", recommandation=" + recommandation + "]";
	}
	
	
	
	
}
