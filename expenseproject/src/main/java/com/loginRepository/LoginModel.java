package com.loginRepository;

public class LoginModel {
	
	private int empid;
	private String userName;
	private String password;
	private String emproles;
	
	
	@Override
	public String toString() {
		return "LoginModel [empid=" + empid + ", userName=" + userName + ", password=" + password + ", emproles="
				+ emproles + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((emproles == null) ? 0 : emproles.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		LoginModel other = (LoginModel) obj;
		if (empid != other.empid)
			return false;
		if (emproles == null) {
			if (other.emproles != null)
				return false;
		} else if (!emproles.equals(other.emproles))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmproles() {
		return emproles;
	}


	public void setEmproles(String emproles) {
		this.emproles = emproles;
	}


	public LoginModel(int empid, String userName, String password, String emproles) {
		super();
		this.empid = empid;
		this.userName = userName;
		this.password = password;
		this.emproles = emproles;
	}
	
	
	
	
	
}// end of class
