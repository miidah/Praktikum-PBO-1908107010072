public class Soal1 {
	public static void main (String [] args) {
		int num1 = 3;
		int num2 = 2;
		
		int hasil1 = num1 + num2;
		int hasil2 = num1 - num2;
		int hasil3 = num1 * num2;
		float hasil4 = num1 / num2;
		int hasil5 = num1 % num2;

		System.out.println("Hasil Penjumlahan : " +num1+ "+" +num2+ "=" +hasil1);
		System.out.println("Hasil Pengurangan : " +num1+ "-" +num2+ "=" +hasil2);
		System.out.println("Hasil Perkalian   : " +num1+ "*" +num2+ "=" +hasil3);
		System.out.println("Hasil Pembagian   : " +num1+ "/" +num2+ "=" +hasil4);
		System.out.println("Hasil Modulus     : " +num1+ "%" +num2+ "=" +hasil5);


	}
}