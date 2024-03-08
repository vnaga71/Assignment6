/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;
import java.util.Scanner;
public class email{
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter an email address: ");
	        String email = s.nextLine();
	        
	        if (isValidEmail(email)) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address.");
	        }
	    }

	    public static boolean isValidEmail(String email) {
	        if (email == null || email.length() == 0) {
	            return false;
	        }

	        boolean hasAtSymbol = false;
	        int dotIndex = -1;
	        int atSymbolIndex = -1;

	        for (int i = 0; i < email.length(); i++) {
	            char ch = email.charAt(i);

	           
	            if (ch == '@') {
	                
	               hasAtSymbol = true;
	                atSymbolIndex = i;
	            }

	            if (hasAtSymbol && ch == '.') {
	                dotIndex = i;
	                break;
	            }
	        }
	        if (!hasAtSymbol || dotIndex == -1 || atSymbolIndex == 0 || dotIndex - atSymbolIndex <= 1 || dotIndex == email.length() - 1) {
	            return false;
	        }

	        return true;
	    }
	}