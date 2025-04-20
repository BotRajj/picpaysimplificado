package com.picpaysimplificado.domain.user;

import java.math.BigDecimal;

import com.picpaysimplificado.domain.user.enums.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "tb_user")
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(of = "id")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String document;
	@Column(unique = true)
	private String email;
	@Enumerated(EnumType.STRING)
	private Integer userType;

	private String firstName;
	private String lastName;
	private String password;
	private BigDecimal balance;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public UserType getUserType() {
		return UserType.valueOf(userType);
	}

	public void setUserType(UserType userType) {
		if (userType != null) {
			this.userType = userType.getCode();
		}
	}

}
