import java.util.Scanner;
public class GitHub_Kod10_Asalmi {

	public static void main(String[] args) {

		int sayi;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz:");
		sayi = Scanner.nextInt();
		//int remainder = sayi%2;
		boolean isPrime =true; //sayi değişkeninin asal olduğunu kabul ediyoruz.
		
		for(int i =2;i<sayi;i++) { 
			if(sayi%i==0) {
				 isPrime = false;
			}
		}
		
		if(isPrime==true) {
			System.out.println("sayi asal");
		} else {
			System.out.println("asal degil");
		}
   }
}	