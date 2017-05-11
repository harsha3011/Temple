package bean;

public class AuthenticationBean {
	
	private String userID;
	private String password;
	private String userType;
	private int loginStatus;
	public String getUserID() {
		return userID;
	}
	public String getPassword() {
		return password;
	}
	public String getUserType() {
		return userType;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

}
