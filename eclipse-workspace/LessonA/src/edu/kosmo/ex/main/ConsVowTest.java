//Oct19

package edu.kosmo.ex.main;

import java.util.Scanner;

import edu.kosmo.ex.vow.ConsVowCount;

/*
8.����ڷκ��� ���� ���ڿ�(��������)���� ������ ���� ������ ����ϴ� ���α׷��� �ۼ�

�Է�:abcd 

���:
�ѱ��ڼ��� 4��
����:3 ��
����:1 �� */
//��Ʈ: sc.next�� charAt Ȱ���� ��.
public class ConsVowTest {

	public static void main(String[] args) {
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��Ͻÿ�.");
		
		String word = sc.next();
		
		            //��ü�� 
		ConsVowCount cons = new ConsVowCount(word);
		cons.countResult();
		
		//System.out.println( "��� Y :: �ߴ� N");
		
		//char ch = sc.next().charAt(0); //�� �� �� �Է¹ް� 0����
		
		//if( ch == 'N' || ch == 'n' ) 
		//	break;
		
		System.out.println( "��� Yes :: �ߴ� No");
		
		 String YesOrNo = sc.next();
		 
		 if(YesOrNo.equals("yes") || YesOrNo.equals("Yes")) // ���ڿ� �񱳴� �ݵ�� equals ���
			 continue;
		 else
			 break;
		
		}
		System.out.println("�����մϴ�.");


	}

}
