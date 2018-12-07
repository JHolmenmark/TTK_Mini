
package TTK_Project;

import java.util.ArrayList;

public class TTK_Users {
    
    private TTK_User userInfo = new TTK_User();
    
    private String userName ;
    private String lastName;
    private String password ;
   // private TTK_Create userList = new TTK_Create(userName, password);
    private ArrayList<TTK_User> userNameAndPasswordList = new ArrayList<>();
    
    public TTK_Users(){
        this.userNameAndPasswordList = new ArrayList<>();
    }
    
    public TTK_Users(String userName, String password){
	TTK_User newUser = new TTK_User(userName, password);
        userNameAndPasswordList.add(new TTK_User(userName, password));
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean doesUserInTheList(){
	boolean userNameInList = false;
	for (int i = 0; i < userNameAndPasswordList.size(); i++){
			
        if (userNameAndPasswordList.get(i).getUserName()== newUser.getUsername()){
	System.out.println("The User name " + userNameAndPasswordList.get(i).getUsername()+ " exists");
	
	userNameInList = true;
       	}else{
            System.out.println("The user does not exist in the database");
        break;
        }  
	}
        return userNameInList;
    }
    public boolean doesPasswordInTheList(){
    	boolean paswordInList = false;
	for (int i = 0; i < userNameAndPasswordList.size(); i++){
	if (userNameAndPasswordList.get(i).getPassword() == userInfo.password()){
	paswordInList = true;
        }
        else{
            break;
        }
	}
        return paswordInList;
	}
   
}


