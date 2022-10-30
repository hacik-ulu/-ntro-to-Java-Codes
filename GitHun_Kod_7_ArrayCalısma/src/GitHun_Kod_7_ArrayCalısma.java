
public class GitHun_Kod_7_ArrayCalısma {

	public static void main(String[] args) {

		double myList[] = {1.2,1.4,1.6};
		double total =0;
		double max = myList[0];
		for(double i:myList) {
			if(max<i) {
				max=i;
			}
			total +=i;
			System.out.println(i);
		}
		System.out.println("Toplam: "+total);
         System.out.println("En buyuk sayi: "+max);		
		
	
		
		
		
   }
}	