package com.employee.respository;

public class Employee {
	
	
	private int EmployeeId;
	private String Emp_FirstName;
	private String Emp_LastName;
	private int Emp_ExpAccount;
	
	
	
	//Start of Constructer
	public Employee(int employeeId, String emp_FirstName, String emp_LastName, int emp_ExpAccount) {
	
	this.EmployeeId =employeeId;
	this.Emp_FirstName=emp_FirstName;
	this.Emp_LastName = emp_LastName;
	this.Emp_ExpAccount = emp_ExpAccount;
	}



	//start of getter and setters
	public int getEmployeeId() {
		return EmployeeId;
	}



	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}



	public String getEmp_FirstName() {
		return Emp_FirstName;
	}



	public void setEmp_FirstName(String emp_FirstName) {
		Emp_FirstName = emp_FirstName;
	}



	public String getEmp_LastName() {
		return Emp_LastName;
	}



	public void setEmp_LastName(String emp_LastName) {
		Emp_LastName = emp_LastName;
	}



	public int getEmp_ExpAccount() {
		return Emp_ExpAccount;
	}



	public void setEmp_ExpAccount(int emp_ExpAccount) {
		Emp_ExpAccount = emp_ExpAccount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Emp_ExpAccount;
		result = prime * result + ((Emp_FirstName == null) ? 0 : Emp_FirstName.hashCode());
		result = prime * result + ((Emp_LastName == null) ? 0 : Emp_LastName.hashCode());
		result = prime * result + EmployeeId;
		return result;
	}


	//Hash Code and equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Emp_ExpAccount != other.Emp_ExpAccount)
			return false;
		if (Emp_FirstName == null) {
			if (other.Emp_FirstName != null)
				return false;
		} else if (!Emp_FirstName.equals(other.Emp_FirstName))
			return false;
		if (Emp_LastName == null) {
			if (other.Emp_LastName != null)
				return false;
		} else if (!Emp_LastName.equals(other.Emp_LastName))
			return false;
		if (EmployeeId != other.EmployeeId)
			return false;
		return true;
	}


//To String
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", Emp_FirstName=" + Emp_FirstName + ", Emp_LastName="
				+ Emp_LastName + ", Emp_ExpAccount=" + Emp_ExpAccount + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmp_FirstName()=" + getEmp_FirstName() + ", getEmp_LastName()=" + getEmp_LastName()
				+ ", getEmp_ExpAccount()=" + getEmp_ExpAccount() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	//end of has code
	
	
	
	
	
	

}//end of class
