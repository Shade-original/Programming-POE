/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class MainLogin {
    
    public String Pass,Uname,Fname,Lname;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainLogin();
    }

    public MainLogin() {
        String Fname = (JOptionPane.showInputDialog("Please enter your Firstname."));
        String Lname = (JOptionPane.showInputDialog("Please enter your Lastname."));
        String Uname = (JOptionPane.showInputDialog("Please enter your Usertname that must containt no more that 8 letters\n"
                    + " and a underscore."));
        String Pass = (JOptionPane.showInputDialog("Please enter your Password."));
            
        boolean checkname = false;
        boolean checkpassword = false;
        Login Login2 = new Login(Pass,Uname,Fname,Lname);
        Login2.checkUserName();
        Login2.checkPasswordComplexity();
        JOptionPane.showMessageDialog(null, Login2.registerUser());
        JOptionPane.showMessageDialog(null, Login2.loginUser());
        JOptionPane.showMessageDialog(null, Login2.returnLoginStatus());
        }
    }   

