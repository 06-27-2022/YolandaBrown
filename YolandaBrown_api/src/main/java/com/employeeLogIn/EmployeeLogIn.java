package com.employeeLogIn;

public class EmployeeLogIn {

	
				
		private String userName;
		private String password;
		private int employeeid;
		
		public int getEmployeeid() {
			return employeeid;
		}
	
	
		public EmployeeLogIn(String userName, String password,int employeeid) {
			
			
			
			this.userName = userName;
			this.password = password;
			this.employeeid = employeeid;
			
			
			
			
		}

		@Override
		public String toString() {
			return "EmployeeLogIn [userName=" + userName + ", password=" + password + ", hashCode()=" + hashCode()
					+ ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getClass()="
					+ getClass() + ", toString()=" + super.toString() + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
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
			EmployeeLogIn other = (EmployeeLogIn) obj;
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
		
		
		
		
		
		

	

}// end of class
