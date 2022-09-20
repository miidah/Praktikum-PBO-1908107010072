import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x, a, b;

        System.out.print("Masukan Nilai Awal : ");
        a = input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        b = input.nextInt();
        
        
        System.out.println("Bilangan Genap : ");
        for(x = a; x<= b; x++){
            if (x%2==0)
                System.out.print(x+" ");
        }
                
    }
}