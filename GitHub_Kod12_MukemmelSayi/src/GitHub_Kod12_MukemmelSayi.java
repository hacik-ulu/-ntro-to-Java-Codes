import java.util.Scanner;
public class GitHub_Kod12_MukemmelSayi {

	public static void main(String[] args) {

		int sayi;
		int total=0;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Lütfen sayiyi giriniz: ");
		sayi = Scanner.nextInt();
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				total+=i;

			}			
		}
		
		if(total==sayi) {
			System.out.println("Mükemmel sayidir!");
		} else {
			System.out.println("Mükemmel sayi degildir!");
		}
        	
	}
}	