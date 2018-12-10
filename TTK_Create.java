package loginSystem;

public class TTK_Create {

    Userss users=new Userss();//Array list is created

    public boolean add(String username, String password, TTK_users Userlist  ) {
        if (!isExist(username)) {
            users.create(username, password);
            return true;
        }
        return false;
    }

    public  boolean isExist(String username){
       return userss.isExist(username);

    }
}

// is Exist is used as checkUsername and password 