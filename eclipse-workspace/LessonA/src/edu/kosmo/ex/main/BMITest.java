//Oct19
package edu.kosmo.ex.main;

import java.util.Scanner;
import edu.kosmo.ex.bmi.BMICalculator;

import edu.kosmo.ex.bmi.BMICalculator;


public class BMITest{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ű(cm)�� �Է��ϼ���.");
		int height = sc.nextInt();
		System.out.println("ü��(kg)�� �Է��ϼ���.");
		int weight = sc.nextInt();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		
	
		bmi.printResult();
		
		
		
	}
	
	

}
