package com.jim.shop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {
	private static final long serialVersionUID = -4465272770078879374L;
	private Integer id;
	private String nickName;
	private String password;
	private String loginName;
	private Date birthday;
	private String email;
	private String phone;
	private String address;
	private String question;
	private String result;
	private Date createOn;
	private boolean isDisabled;

	public User() {
	}

	public User(String loginName, String password, Date createOn) {
		this.loginName = loginName;
		this.password = password;
		this.createOn = createOn;
	}

	@Column(name = "address", nullable = true)
	public String getAddress() {
		return address;
	}

	@Column(name = "birthday", nullable = true)
	public Date getBirthday() {
		return birthday;
	}

	@Column(name = "createOn", nullable = false)
	public Date getCreateOn() {
		return createOn;
	}

	@Column(name = "email", nullable = true)
	public String getEmail() {
		return email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	public Integer getId() {
		return id;
	}

	@Column(name = "isDisabled", nullable = true)
	public boolean getIsDisabled() {
		return isDisabled;
	}

	@Column(name = "loginName", nullable = false, unique = true)
	public String getLoginName() {
		return loginName;
	}

	@Column(name = "nickName", nullable = true)
	public String getNickName() {
		return nickName;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	@Column(name = "phone", nullable = true)
	public String getPhone() {
		return phone;
	}

	@Column(name = "question", nullable = true)
	public String getQuestion() {
		return question;
	}

	@Column(name = "result", nullable = true)
	public String getResult() {
		return result;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public void setIsDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((createOn == null) ? 0 : createOn.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isDisabled ? 1231 : 1237);
		result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (createOn == null) {
			if (other.createOn != null)
				return false;
		} else if (!createOn.equals(other.createOn))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDisabled != other.isDisabled)
			return false;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}
	
	
}