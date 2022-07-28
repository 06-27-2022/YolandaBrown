package com.manager.repository;



public class Managers {
	
	//Variable declearations
	private String mgr_Num;
	private String mgr_firstName;
	private String mgr_lasttName;
	private String mgr_approval_acct;
	
	
	//Constructors
	public Managers(String mgr_Num, String mgr_firstName, String mgr_lasttName, String mgr_approval_acct) {
		
		this.mgr_Num = mgr_Num;
		this.mgr_firstName = mgr_firstName;
		this.mgr_lasttName = mgr_lasttName;
		this.mgr_approval_acct = mgr_approval_acct;
	}


	public String getMgr_Num() {
		return mgr_Num;
	}


	public void setMgr_Num(String mgr_Num) {
		this.mgr_Num = mgr_Num;
	}


	public String getMgr_firstName() {
		return mgr_firstName;
	}


	public void setMgr_firstName(String mgr_firstName) {
		this.mgr_firstName = mgr_firstName;
	}


	public String getMgr_lasttName() {
		return mgr_lasttName;
	}


	public void setMgr_lasttName(String mgr_lasttName) {
		this.mgr_lasttName = mgr_lasttName;
	}


	public String getMgr_approval_acct() {
		return mgr_approval_acct;
	}


	public void setMgr_approval_acct(String mgr_approval_acct) {
		this.mgr_approval_acct = mgr_approval_acct;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mgr_Num == null) ? 0 : mgr_Num.hashCode());
		result = prime * result + ((mgr_approval_acct == null) ? 0 : mgr_approval_acct.hashCode());
		result = prime * result + ((mgr_firstName == null) ? 0 : mgr_firstName.hashCode());
		result = prime * result + ((mgr_lasttName == null) ? 0 : mgr_lasttName.hashCode());
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
		Managers other = (Managers) obj;
		if (mgr_Num == null) {
			if (other.mgr_Num != null)
				return false;
		} else if (!mgr_Num.equals(other.mgr_Num))
			return false;
		if (mgr_approval_acct == null) {
			if (other.mgr_approval_acct != null)
				return false;
		} else if (!mgr_approval_acct.equals(other.mgr_approval_acct))
			return false;
		if (mgr_firstName == null) {
			if (other.mgr_firstName != null)
				return false;
		} else if (!mgr_firstName.equals(other.mgr_firstName))
			return false;
		if (mgr_lasttName == null) {
			if (other.mgr_lasttName != null)
				return false;
		} else if (!mgr_lasttName.equals(other.mgr_lasttName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Managers [mgr_Num=" + mgr_Num + ", mgr_firstName=" + mgr_firstName + ", mgr_lasttName=" + mgr_lasttName
				+ ", mgr_approval_acct=" + mgr_approval_acct + ", getMgr_Num()=" + getMgr_Num()
				+ ", getMgr_firstName()=" + getMgr_firstName() + ", getMgr_lasttName()=" + getMgr_lasttName()
				+ ", getMgr_approval_acct()=" + getMgr_approval_acct() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	

	//end of getters setters
	
	
	
	
	
	
	
	
	
	
	
}// end of class
