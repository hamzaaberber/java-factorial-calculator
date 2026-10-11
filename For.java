import java.util.Scanner;
public class For{
public static void main(String[] args){
   Scanner input = new Scanner (System.in);
    System.out.println("faktöriyelini hesaplamak isediğiniz sayıyı giriniz  ");
    int sayi = input.nextInt();
    long faktorıyel = 1;
    for (int i = 1; i <= sayi ; i++ ) {
        faktorıyel = faktorıyel * i;
    }
    System.out.println(sayi + "! = " + faktorıyel );


















}
}