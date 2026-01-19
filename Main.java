package Array_in_java;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[] fruits = {"mango", "guyabano", "berry"};
	
    boolean isFound = false;
	for(int i = 0; i < fruits.length; i++){
		if (fruits[i].equalsIgnoreCase("Mango")) {
			System.out.println("Element found at index " + i);
			isFound = true;
			break;
		}
	}
	    if(!isFound){
		System.out.println("Element not found");
	    }
	     sc.close();
	}
}

