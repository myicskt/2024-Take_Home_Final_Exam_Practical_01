package practical_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GenerateRandomAndPrintNthNumber {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the the number : ");
		int input = sn.nextInt();
		if (input != 0 && input <= 500) {
			int output = generateRandomNumber(input);
			System.out.println("The nth smallest number in array is : " + output);
		} else {
			System.out.println("you enterthe wrong number. It must be 1- 500 range");
		}

	}

	public static int generateRandomNumber(int nthNumber) {

		List<Integer> numbers = new ArrayList();
		for (int i = 0; i < 500; i++) {
			int randomNum = 0;

			while (numbers.contains(randomNum) || randomNum == 0) {
				randomNum = (int) (Math.random() * 1000);
			}
			numbers.add(randomNum);
		}
		Collections.sort(numbers);

		int result = numbers.get(nthNumber - 1);

		/*
		 *
		 * for (int i = 0; i < numbers.size(); i++) { System.out.print("sn_" + (i + 1) +
		 * " : " + numbers.get(i) + ", ");
		 * 
		 * }
		 */

		return result;
	}

}
