
package New_TTK_Project;

import java.util.ArrayList;

public class TTK_Users{
    
    private String userName;
    private String password;
    
    //instance creating method for making a new arraylist of users,
    private ArrayList<TTK_User> userList = new ArrayList<>();
    
    public TTK_Users(){
      
    }
    public TTK_Users(String userName, String password){
        this.userName = userName;
        this.password = password;
        userList.add(new UserClass(userName, password));
    }
     //add user to list method
    public String addUserList(String userName, String password){
        this.userName = userName;
        this.password = password;
         userList.add(new UserClass(userName, password));
        return null;
    }
    //check if user in list method
    public boolean checkUserName(String userName){
        boolean userNameInList = false;
        this.userName = userName;
        for (int i = 0; i < userList.size(); i++){
            if (this.userName == userList.get(i).getUserName()){
            return true;   
            }else{
                return false; 
            }
        }
        return userNameInList;
    }
    public boolean checkPassword(String password){
        boolean passwordInList = false;
        this.password = password;
        for (int i = 0; i < userList.size(); i++){
            if (this.password == userList.get(i).getPassword()){
                return true;
            }else{
                 return false;
            }
        }
        return passwordInList;
    }
    
    //check if user in list and password correct method (login)
    public boolean allowLogin(String userName, String password){
        boolean allowUserLogin = false;
        this.userName = userName;
        this.password = password;
        if (checkUserName(userName)==true && checkPassword(password)==true){
           return true;
        }
        return allowUserLogin;
    }
}
