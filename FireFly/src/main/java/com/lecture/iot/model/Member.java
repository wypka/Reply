package com.lecture.iot.model;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class Member {
	@NotEmpty(message ="�����ID�� �ʼ� �׸��Դϴ�.")
	@Length(min=4, message="�ּ� 4���� �̻��̾�� �մϴ�.")
	private String userId;
	
	@NotEmpty(message ="�̸��Է��� �ʼ� �׸��Դϴ�.")
	private String name;
	
	@NotEmpty(message ="��й�ȣ �Է��� �ʼ� �׸��Դϴ�.")
	@Length(min=4, message="�ּ� 4���� �̻��̾�� �մϴ�.")
	private String password;
	
	@NotEmpty(message ="e������ �ʼ��׸��Դϴ�.")
	@Email(message="E-mail������ �ƴմϴ�.")
	private String email;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Member(String userId, String name, String password, String email, Date date) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.date = date;
	}
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
}
