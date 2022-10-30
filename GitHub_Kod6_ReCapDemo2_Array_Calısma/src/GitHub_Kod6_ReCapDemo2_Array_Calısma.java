
public class GitHub_Kod6_ReCapDemo2_Array_Calısma {

	public static void main(String[] args) {
		double myArray[]= {1.2,1.4,1.6};
		double total =0;
		for (int i = 0; i < myArray.length; i++) {
			total+=i;
			System.out.println(myArray[i]);
		}
		System.out.println("Toplam: "+total);
  }
}	