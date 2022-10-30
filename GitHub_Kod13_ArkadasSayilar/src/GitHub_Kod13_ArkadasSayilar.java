import java.util.Scanner;
public class GitHub_Kod13_ArkadasSayilar {

	public static void main(String[] args) {
     //220-284
		int sayi1,sayi2;
		int total1=0;
		int total2=0;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("sayi1: ");
		sayi1=Scanner.nextInt();
		System.out.println("sayi2: ");
		sayi2=Scanner.nextInt();
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				total1+=i;
			}
			
		}
		for(int h=1;h<sayi2;h++) {
			if(sayi2%h==0) {
				total2+=h;
			}
			
		}
		
		if(sayi1==total2 && sayi2==total1) {
			System.out.println("Bu iki sayi arkadas sayidir!");
		} else {
			System.out.println("Bu iki sayi arkadas sayi degildir!");
		}
		
	}

}
