
public class Num05 {

	public static void main(String[] args) {

		starPrint2(5);

	}

	public static void starPrint2(int num) {

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= num; j++) {

				System.out.print("*");

			}
			System.out.println(" ");

		}

	}
}


/*
����� 
***** 
0**** 
00*** 
000** 
0000* 

 */