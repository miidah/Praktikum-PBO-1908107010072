import java.util.Scanner;
   
class Soal3 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in); 
    int tinggi_segitiga,i,j;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();
     
    System.out.println();
    
    for(i = 0; i < tinggi_segitiga; i++) {
      for(j = 1; j <= tinggi_segitiga-i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
     
  }
}