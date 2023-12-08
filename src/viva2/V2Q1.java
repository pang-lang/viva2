package viva2;
import java.util.Scanner;
public class V2Q1 {
    // programmer : Yi Lin 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password=scanner.nextLine();
        System.out.println(valPassword(password));
    }  
    public static boolean valPassword ( String password){ 
        if ( password.length()>7){
            if ( checkPass(password)){
                return true;
            } else {
                return false;
            }
        } else {     
            return false; 
        }
    }
    
    public static boolean checkPass (String password) {
        final int NUM_UPPER_LETTERS=1;
        final int NUM_LOWER_LETTERS=1;
        final int NUM_SPECIAL_CHAR=1;
        final int NUM_DIGITS=3;
        int upperCase=0;
        int lowerCase=0;
        int specialChar=0;
        int digit=0;

        boolean hasNum= false; boolean hasCap= false; boolean hasLow = false; boolean hasSpecial= false;
        char c;
        for ( int i =0 ; i< password.length();i++){
            c= password.charAt(i);
            if ( Character.isDigit(c)){
                hasNum= true;
                digit ++;
            } else if ( Character.isUpperCase(c)){
                hasCap= true;
                upperCase++; 
            } else if ( Character.isLowerCase(c)){
                hasLow= true; 
                lowerCase ++ ; 
            } else if ( "!@#$%^&*()-+".indexOf(c)>=0){ 
                hasSpecial= true;
                specialChar ++;
            }  
            if (upperCase>=NUM_UPPER_LETTERS && lowerCase>=NUM_LOWER_LETTERS && digit>=NUM_DIGITS &&  specialChar==NUM_SPECIAL_CHAR && password.length()>=8){ 
                return true;
            }
        }
            return false; 
    }
}

    

