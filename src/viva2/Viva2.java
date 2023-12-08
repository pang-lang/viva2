package viva2;
import java.util.Scanner;
public class Viva2 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Can you assist James to write a Java method that accepts a String as parameter and check whether the user's input is a valid password.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pw = sc.nextLine();
        System.out.println(isValidPassword(pw));
    }
    public static boolean isValidPassword(String a){
        int isUpperCase = 0, isLowerCase = 0, isDigit = 0, isSpecialChar = 0;
        for (int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if (ch >='A' && ch <='Z')
                isUpperCase++;
            else if (ch >= 'a' && ch <= 'z')
                isLowerCase++;
            else if (ch >= '0' && ch <= '9')
                isDigit++;
            else if ("!@#$%^&*()-+".indexOf(ch)>=0)
                isSpecialChar++;
        }
        if (a.length()>=8 && isUpperCase>=1 && isLowerCase>=1 && isDigit >=3 && isSpecialChar==1){
            return true;
        } else {
            return false;
        }
    } 
}
//Password rules:
//i) A password contains at least 8 characters
//ii) A password contains at least 1 capital and small letter
//iii) A password contains at least 3 digits
//iv) A password must consists only 1 special character


