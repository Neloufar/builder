//Neloufar Loghmani
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author neliloghmani
 */

public class Builder {

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		       
           System.out.println("Please type 'Java is fun!' ");
           String input = in.nextLine();
           StringBuilder string = new StringBuilder(input); // creates builder
           StringBuilder string1 = new StringBuilder(input);
           System.out.println("Capacity:  " + string.capacity()); // amount of storage available
           string.append(" I love it!"); // adds to the string
           System.out.println(string);// prints string + insert
           System.out.println("Do you love it?" );
           String input1 = in.nextLine(); // allows user input
           string.insert(string1.length() , input1); // inserts input1 into the sentence
           System.out.println(string); //outputs new code + the insert and append
				
	}

}