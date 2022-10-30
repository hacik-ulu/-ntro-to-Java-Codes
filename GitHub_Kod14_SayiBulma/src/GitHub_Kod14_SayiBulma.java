public class GitHub_Kod14_SayiBulma {

	public static void main(String[] args) {

		int sayilar[]= {1,2,3,4,5,6,7};
		int aranacak_sayi=97;
		boolean mevcut_mu=false; // mevcut değil
		

		for(int i:sayilar) {
			if(i==aranacak_sayi) {
				mevcut_mu=true;
				break;
			}else {
				mevcut_mu=false;
			}
		}
		
		if(mevcut_mu==true) {
			System.out.println("sayi mevcut");
		} else {
			System.out.println("sayi mevcut değil!");
		}

		
		
		
		
		
		
		
	}		
}	