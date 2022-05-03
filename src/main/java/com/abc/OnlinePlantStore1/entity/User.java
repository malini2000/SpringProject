package com.abc.OnlinePlantStore1.entity;



import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String Username;
	private String Password;
	private String role;
	private long DebitCardNo;
	private int TotalPurchase;

	
	@Embedded
	@Column(nullable = true)
	private UserDetails userDeatils;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(int userId,String userName, String passWord, String role, long debitCardNo, int totalPurchase,
			UserDetails userDeatils) {
		super();
		this.userId = userId;
		Username = userName;
		Password = passWord;
		this.role = role;
		DebitCardNo = debitCardNo;
		TotalPurchase = totalPurchase;
		this.userDetails = userDetails;
	}


	public String getUserName() {
		return Username;
	}


	public void setUserName(String userName) {
		Username = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public long getDebitCardNo() {
		return DebitCardNo;
	}


	public void setDebitCardNo(int debitCardNo) {
		DebitCardNo = debitCardNo;
	}


	public int getTotalPurchase() {
		return TotalPurchase;
	}


	public void setTotalPurchase(int totalPurchase) {
		TotalPurchase = totalPurchase;
	}


	public UserDetails getUserDeatils() {
		return userDeatils;
	}


	public void setUserDeatils(UserDetails userDeatils) {
		this.userDeatils = userDeatils;
	}
	
}