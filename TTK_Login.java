public class TTK_Login {
    
	public TTK_Login() {
		
	}
	public Boolean checkUsername(String tempUsername, TTK_Users userList) {
		
		return userlist.checkUserName(tempUsername);
	}
	
	public Boolean logInUser(String tempUsername, String tempPassword, TTK_Users userList) {
	
		return userList.allowLogin(tempUsername, tempPassword);
	}
}
