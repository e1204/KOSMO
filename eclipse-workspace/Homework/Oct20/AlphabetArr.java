package Oct20;
//8��
/*
 char �迭�� �����Ͽ�, ���ĺ� A~Z���� ���� ��, ��� �غ���. 
���ĺ��� 26��.
*/


public class AlphabetArr {

		public static void main(String[] args) {
			char[] ca = new char[26];
			
			for(int i=0; i<ca.length; i++) {
				
				ca[i] =  (char)('A'+ i);
			}
			for(char e : ca) {
				System.out.print(e + " ");
			}
		}
	}


