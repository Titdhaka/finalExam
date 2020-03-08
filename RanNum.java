package randomInt;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RanNum {

	public static void main(String[] args) {

		Random randomNo = new Random(); // create an object of random class
		
		Set<Integer> xy = new TreeSet<Integer>();
		
		//getting random integer up to 500
		while(xy.size()<500) {
		int rand = randomNo.nextInt((800 - 200)+ 1)+200;
		//System.out.println(rand);
		xy.add(rand);
		}
		System.out.println(xy);
		System.out.println(xy.size());
		Object[] random500num = xy.toArray();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Kindly enter the nth smallest number you want? ");
		int num = userInput.nextInt();
		System.out.println(random500num[num-1]);
	   }
}
