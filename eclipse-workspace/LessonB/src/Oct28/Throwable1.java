package Oct28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Throwable1 {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\java\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file); //IOException �߻� ����
			writer.write('A'); //IOException �߻� ����
			writer.write('z'); //IOException �߻� ����
			
			if(writer != null)
				writer.close();
			
		} catch(IOException e){
			e.printStackTrace();
			
		}
		//���ư��� �Ϸ��� ��ο��� simple.txt������ ����� ��� ��

	}

}
