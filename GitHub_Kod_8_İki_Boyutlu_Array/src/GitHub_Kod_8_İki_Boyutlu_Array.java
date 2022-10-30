
public class GitHub_Kod_8_İki_Boyutlu_Array {

	public static void main(String[] args) {

		String sehirler [][]= new String[3][3];
		sehirler[0][0]="Istanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Canakkale";
		sehirler[1][0]="Burdur";
		sehirler[1][1]="Mersin";
		sehirler[1][2]="Samsun";
		sehirler[2][0]="Rize";
		sehirler[2][1]="Siirt";
		sehirler[2][2]="Sanliurfa";

		for(int i=0;i<=2;i++) { // Satırları gezer.
			System.out.println("------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}

     }
  }	
