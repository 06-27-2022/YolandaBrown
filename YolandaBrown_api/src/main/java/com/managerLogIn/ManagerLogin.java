package com.managerLogIn;

public class ManagerLogin {

	private String mgrUserName;
	private String mgrPassword;
	private String mgrExpenseId;
	
	





	public String getMgrExpenseId() {
		return mgrExpenseId;
	}


	public void setMgrExpenseId(String mgrExpenseId) {
		this.mgrExpenseId = mgrExpenseId;
	}


	//Constructor
	public ManagerLogin(String mgrUserName, String mgrPassword,String mgrExpenseId) {
		
		this.mgrUserName = mgrUserName;
		this.mgrPassword = mgrPassword;
		this.mgrExpenseId = mgrExpenseId;
	}


	public String getMgrUserName() {
		return mgrUserName;
	}


	public void setMgrUserName(String mgrUserName) {
		this.mgrUserName = mgrUserName;
	}


	public String getMgrPassword() {
		return mgrPassword;
	}


	public void setMgrPassword(String mgrPassword) {
		this.mgrPassword = mgrPassword;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mgrPassword == null) ? 0 : mgrPassword.hashCode());
		result = prime * result + ((mgrUserName == null) ? 0 : mgrUserName.hashCode());
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
		ManagerLogin other = (ManagerLogin) obj;
		if (mgrPassword == null) {
			if (other.mgrPassword != null)
				return false;
		} else if (!mgrPassword.equals(other.mgrPassword))
			return false;
		if (mgrUserName == null) {
			if (other.mgrUserName != null)
				return false;
		} else if (!mgrUserName.equals(other.mgrUserName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ManagerLogin [mgrUserName=" + mgrUserName + ", mgrPassword=" + mgrPassword + "]";
	}

	
	
	
	
	
	

}// end of class
