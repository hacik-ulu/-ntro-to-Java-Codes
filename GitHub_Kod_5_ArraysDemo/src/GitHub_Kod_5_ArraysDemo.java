
public class GitHub_Kod_5_ArraysDemo {

	public static void main(String[] args) {

		String ogrenciler[]= {"Ali","Veli","Hasan"};
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
         }
		
		System.out.println("---------------------------------");
		
		String[]Ogrenciler=new String[4];
		Ogrenciler[0]="Ali";
		Ogrenciler[1]="Veli";
		Ogrenciler[2]="Deren";
		Ogrenciler[3]="Yagmur";
		
		for (int j = 0; j < Ogrenciler.length; j++) {
			System.out.println(Ogrenciler[j]);
		}

		System.out.println("---------------------------------");
			
	
	for(String ogrenci: Ogrenciler) {
		System.out.println(ogrenci);
	}
  }	
}	