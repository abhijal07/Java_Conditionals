//To check whether the entered number is odd or even

import java.util.Scanner;

public class Even_Odd {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        if (n % 2 == 0) {
	            System.out.println("Even");
	        } else {
	            System.out.println("Odd");
	        }

	        sc.close();
	    }
	}

