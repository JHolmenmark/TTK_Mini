import java.util.Scanner;

public class TTK_Main {
  private static String currentUsername = "Guest";
  private static String optionSelect = "";
  private static Scanner scan = new Scanner(System.in);
  private static TTK_Users userList = new TTK_Users();
  private static boolean goLean = true;
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_RED  = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void welcomeLine() {
    System.out.println("Welcome " + currentUsername + "! ");
  }
  public static void optionList() {
    if(currentUsername.equals("Guest")){
      System.out.println("Enter Login to log in as a user or Create to register a new user");
    } else {
      System.out.println("Enter Logout to log out and return to guest status or Create to register a new user");
    }
    optionSelect = scan.next().toLowerCase();
  }

  public static boolean optionCheck() {
    boolean goodOption = true;
    if(optionSelect.contains("login")){
      if(currentUsername.equals("Guest")){
        //if current name is guest that means you are not currently logged in
        System.out.println("please enter your username.");
        String tempUsername = scan.next();
        if(TTK_Login.checkUsername(tempUsername, userList)) {                     //METODCALL FOR TTK_LOGIN HERE
          //checks that the username exists in our userList and, if so, asks for the password)
          System.out.println("please enter your password.");
          String tempPassword = scan.next();
          if(TTK_Login.logInUser(tempUsername, tempPassword, userList)) {         //METODCALL FOR TTK_LOGIN HERE
            //login succeeded, printing welcome message.
            welcomeLine();
          } else {
            //login failed due to wrong password
            System.out.println("That was the wrong password. ");
          }
        } else {
          //username does not exist in our userList
          System.out.println("That username was not found in the database. ");
        }
      } else {
        //if you got here, you are already logged in
        System.out.println("You are already logged in. ")
      }
    } else if (optionSelect.contains("logout")) {
      currentUsername = "Guest";
      System.out.println("You are now logged out");
      welcomeLine();
    } else if (optionSelect.contains("create")) {
      System.out.println("Please enter the new username: ");
      String newUsername = scan.next();
      if(!TTK_Create.checkUsername(newUsername, userList)) {                              //METHOD CALL FOR TTK_Create HERE
        //checks that the user does not already exists
        System.out.println("Please enter the new user's password");
        String newPassword = scan.next();
        if(TTK_Create.createUser(newUsername, newPassword, userList)) {                   //METHOD CALL FOR TTK_Create HERE
          System.out.println("New user" + newUsername + "has been created!");
        } else {
          System.out.println("Sorry, for some reason we could not create the new user!");
        }
      }
    } else if (optionSelect.contains("quit" || optionSelect.contains("exit"))) {
      goLean = false;
    } else {
      //go here if none of the accepted keywords were given by the user.
      goodOption = false;
      System.out.println("That was not one of the options available, please try again. ")
    }
    return goodOption;
  }

  public static void main(String[] args) {
    welcomeLine();
    optionList();

    System.out.println(optionSelect);

  }
}
