package GitHub_Kod_2_ReCap_EnBuyukSayi;
public class GitHub_Kod_2_ReCap_EnBuyukSayi {

	public static void main(String[] args) {

		int sayi1=20;
		int sayi2=30;
		int sayi3=45;
		int EnBuyuk=sayi1;
		
		if(EnBuyuk<sayi2) {
			EnBuyuk=sayi2;
		}

		if(EnBuyuk<sayi3) {
			EnBuyuk=sayi3;
		}
		System.out.println("En Buyuk Sayi: "+EnBuyuk);
	}

}
