package com.Encapsulation;

public class Password {
          private String username;
          private String password;
          
//constructor-----------------------------------------
          Password(String username, String password){
        	  this.username = username;
        	  if(password.length()<8) {
        		  System.out.println("Invalid password");
        	  }else {
        		  this.password = password;
        	  }
          }
//methods------------------------------------------------
          void login(String username, String password) {
        	  if(this.username.equals(username)&&this.password.equals(password)) {
        		  System.out.println("Login Successful");
        	  }else {
        		  System.out.println("Invalid Username or Password");
        	  }
          }
          
          void changePassword(String oldPassword, String newPassword) {
        	  if(!this.password.equals(oldPassword)) {
        		  System.out.println("Invalid old password");
        	  }else if(newPassword.length()<8){
        		  System.out.println("Password must contain minimum 8 characters");
        	  }else {
        		  this.password = newPassword;
        		  System.out.println("Password Changed Successfully");
        	  }
          }
          
          void displayUsername() {
        	  System.out.println("Username: "+username);
          }
	public static void main(String[] args) {
       Password obj = new Password("Krishna","23456789");
       obj.displayUsername();
       System.out.println();
       System.out.println("Login with wrong password:");
       obj.login("Krishna", "23452345");
       System.out.println();
       System.out.println("Login with correct password:");
       obj.login("Krishna", "23456789");
       System.out.println();
       System.out.println("Changing password:");
       obj.changePassword("23456789","98765432");
    
	}

}
