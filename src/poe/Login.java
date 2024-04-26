/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    public String password, username, firstname, lastname;
    public boolean checkingU, checkingP;
    
    public Login(String password, String username, String firstname, String lastname){
        this.password = password;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public boolean checkUserName(){
        while(username.length() <= 5 || !username.contains("_")){
            username = JOptionPane.showInputDialog(null, "Username is not formatted correctly, Please ensure that username has no underscore and contains 5 characters");
        }
        checkingU = true;
        return checkingU;
    }
    
    public boolean checkPasswordComplexity(){
        boolean PassDig = false;
        boolean PassSpecial = false;
        boolean PassUpper = false;
        
        while (password.length() < 8 || PassUpper == false || PassDig == false || PassSpecial == false){
            for (int i = 0; i < password.length(); i++){
                char SinglePass = password.charAt(i);
                if(Character.isUpperCase(SinglePass)){
                    PassUpper = true;
                }
                if(Character.isDigit(SinglePass)){
                    PassDig = true;
                }
                if(Character.isLetter(SinglePass) || !Character.isDigit(SinglePass)){
                    PassSpecial = true;
                }
            }
            password = (JOptionPane.showInputDialog(null, "Password is not corrrectly formatted, Please ensure that the password\n"
                    + "contains atleast 8 characters\n"
                    + "a capital letter\n"
                    + "a number\n"
                    + "and a special character"));
        }
        checkingP = true;
        return checkingP;
    }
    
    public String registerUser(){
        String Output = "";
        if(checkingU == true && checkingP == true){
            Output = "welcome " + firstname + "," + lastname + " it is great to see you again.";
        }
        if(checkingU == false || checkingP == false){
            Output = "Username or Password is incorrect, Please try again.";
        }
        return Output;
    }
    
    public boolean loginUser(){
        String UsernameComp = username;
        String PasswordComp = password;
        do{
            UsernameComp = JOptionPane.showInputDialog("Please reenter your username");
            PasswordComp = JOptionPane.showInputDialog("Please reenter your password");
        }
        while (UsernameComp == username || PasswordComp == password);
        return true;
    }
    
    public String returnLoginStatus(){
        boolean statement;
        String ReturnOutput = "";
        if (loginUser() == true){
            ReturnOutput = "A successful login.";
            statement = true;
        }
        else{
            ReturnOutput = "A failed login.";
            statement = false;
        }
        return ReturnOutput;
    }
 
}
