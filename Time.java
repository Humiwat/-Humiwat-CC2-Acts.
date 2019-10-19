import javax.swing.*;
public class Time{
    public static void main(String args []){
    
    String askInput;
    int minutes, hours, minute;
    
    askInput = JOptionPane.showInputDialog("Enter time in minutes: ");
    minutes = Integer.parseInt(askInput);
    
    hours = minutes/60;
    minute = minutes%60;
    
    System.out.println(+minutes+" becomes "+hours+" hours and "+minute+" minutes ");
    }
    }
    
    