// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.Scanner;

/**
 * email
 */
public class email {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: "); String email1 = sc.nextLine();

        
        String username1 = "";

        for (int i=0; i<email1.length(); i++){

            if ( '@' == email1.charAt(i) ){

                break;
            } else {
                username1 = username1 + email1.charAt(i);
            }
        }
        
        System.out.println("Username: "+username1);

    }
}