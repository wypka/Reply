package com.lecture.iot.model;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class Member {
	@NotEmpty(message ="사용자ID는 필수 항목입니다.")
	@Length(min=4, message="최소 4글자 이상이어야 합니다.")
	private String userId;
	
	@NotEmpty(message ="이름입력은 필수 항목입니다.")
	private String name;
	
	@NotEmpty(message ="비밀번호 입력은 필수 항목입니다.")
	@Length(min=4, message="최소 4글자 이상이어야 합니다.")
	private String password;
	
	@NotEmpty(message ="e메일은 필수항목입니다.")
	@Email(message="E-mail형식이 아닙니다.")
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
