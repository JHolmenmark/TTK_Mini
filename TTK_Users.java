
package TTK_Project;

import java.util.ArrayList;

public class TTK_Users {
    
    private String userName;
    private String password;
    
    //instance creating method for making a new arraylist of users,
    private ArrayList<TTK_User> userList = new ArrayList<>();
    
    public TTK_Users(){
      this.userName = "";
      this.password = "";
    }
    
     //add user to list method
    public void addUserList(String userName, String password){
        
         this.userList.add(new TTK_User(userName, password));
    }
    //check if user in list method
    public boolean checkUserName(String userName){
        this.userName = userName;
      
        for (int i = 0; i < userList.size(); i++){
            if (this.userName == userList.get(i).getUsername()){
            return true;  
            }
        }
        return false;
    }
    public boolean checkPassword(String password){
        this.password = password;
        for (int i = 0; i < userList.size(); i++){
            if (this.password == userList.get(i).getPassword()){
                return true;
            }
        }
        return false;
    }
    //check if user in list and password correct method (login)
    public boolean allowLogin(String userName, String password){
       
        this.userName = userName;
        this.password = password;
        if (checkUserName(userName) && checkPassword(password)){
           return true;
        }
        return false;
    }
    public String getUsersUserName(int index){
        
        return this.userList.get(index).getUsername();
    }
    public String getUsersPassword(int index){
        return this.userList.get(index).getUsername();
    }
    public void setUsersUserName(String userName){
        this.userName = userName;
    }
    public void setUsersPassword(String password){
        this.password = password;
    }
}
