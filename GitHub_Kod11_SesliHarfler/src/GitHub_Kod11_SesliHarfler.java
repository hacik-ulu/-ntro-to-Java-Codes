import java.util.Scanner;

public class GitHub_Kod11_SesliHarfler {

	public static void main(String[] args) {

		String ch;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Lutfen bir harf girin: ");
		ch = Scanner.next();
		
		switch(ch) {
		
		case "A":
		case "I":
		case "O":
		case "U":
		      System.out.println("Kalin sesli harf");
		      break;
		default:
			System.out.println("Ince sesli harf");
		    break;
		
		}
	}

}
