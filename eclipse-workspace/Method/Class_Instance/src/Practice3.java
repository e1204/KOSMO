//BankAccount ������ ����
class Song {

	String title;
	String artist;
	int year;
	String country;

	Song(int year, String country, String artist, String title) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	void show() {
		System.out.println(year + "��, " + country + " ������ " + artist + "�� �θ� " + "\"" + title + "\"");

	}

}

public class Practice3 {

	public static void main(String[] args) {

		Song song = new Song(1978, "������", "ABBA", "Dancing Queen");

		song.show();

	}

}

//��°�
//1978��, ������ ������ ABBA�� �θ� "Dancing Queen"
