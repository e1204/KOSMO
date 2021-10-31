package Oct28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {
	public static void main(String[] args) throws IOException {
		
		md1();
	}
		
		public static void md1() throws IOException {
	
		md2();
		}
		
		public static void md2() throws IOException{ //throws �ڿ��� ���ܰ�ü�� �Է��Ѵ�.
			//�� �� �Լ� �ȿ��� ������ ����� �Ǹ� throws IOException�� jvm�� �����شٰ� �׷���
			//md2�� ȣ���� ������ �����ٰŶ�� ��.
			//å�������� ���� ȣ���� �Լ��� �����ڴٴ� ��. md2�� ���� ȣ���ߴ�? md1��. �׷��� üũ�� md1�� �ض�.
			//checked ���������� �ݵ�� try catch�� ������, throws �ϸ� �Ǵµ� md2�� throws�ؼ� å������ ����
			//md2�� å�������ϸ� �ᱹ main���� ���µ� main�� �ذ��ؾ� �� ���� 
			//�׷��� md1�� throw����. �׷� ���� main�� ȣ������? jvm�� ȣ����. jvm �ϰ� �ذ��� �Ѥ�  => ���� �ذ� ���ҰŶ�°� ����������
			// �ǹ������� �׷��� �̰� ����. �ݵ�� try catch�� ���� ��. 
			// ���� �׽�Ʈ Ȯ���Ұ�. trycatch ������. �׷��� ��.
			
			
			Path file = Paths.get("C:\\java\\Simple.txt");
			BufferedWriter writer = null;
			
				writer = Files.newBufferedWriter(file); //IOException �߻� ����
				writer.write('A'); //IOException �߻� ����
				writer.write('z'); //IOException �߻� ����
				
				if(writer != null)
					writer.close();
				
			
	

	}

}
