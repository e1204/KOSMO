//Oct19
package edu.kosmo.ex.vow;

public class ConsVowCount {

		private String word;
		private int consonant;
		private int vowel;
		
		public ConsVowCount (String word) {
			this.word = word;
			consonant = 0;
			vowel = 0;	
		}
		
		
		//�ؿ� countResult�Լ��� �־ �Ǵµ� �ϳ��� ����̶� ���� �Q��.
		//private�� ���������θ� ���� �Ŵϱ�
		private void count(char ch) {
		
			//if else�� switch �� ���ϴ� �� ����
			
			switch (ch) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				vowel++;
				break; //�ɸ��� �극��ũ����

			default:
				consonant ++;
				break;
			}
			
		}
		
		public void countResult() {
			//�ѱ��ڼ��� 4��
			//����:3 ��
			//����:1 ��
			
			for (int i = 0; i<word.length(); i++) {
				char ch = word.charAt(i);
				count(ch);
			
			}
			
			System.out.println("�� ���� ���� " + word.length());
			System.out.println("���� ������ " + vowel); //this.vowel�� �ᵵ ��
			System.out.println("���� ������ " + consonant);
			
			
		}
		
	

}
