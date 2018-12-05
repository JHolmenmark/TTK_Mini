import java.util.Scanner;

public class TTK_User {
  private String username;
  private String password;

public User() {

}
public User(String tempusername, String temppassword) {
      this.username = tempusername;
      this.password = temppassword;
}

public String getUsername() {

return username;

  }

public void setUsername(String username) {
this.username = username;
  }
public boolean checkUsername(String tempusername){
  return this.password.equals(tempusername);
}
public String getPassword() {
return password;
	}
public void setPassword(String password) {
this.password = password;
	}
  public boolean checkPassword(String temppassword){
    return this.password.equals(temppassword);
  }
