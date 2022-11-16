import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Number,toplam=0,perfectNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        Number = input.nextInt();

        for(int i=1;i<=Number;i++){
            if(Number %i ==0){
                toplam +=i;

            }
        }

        perfectNumber = toplam - Number;
        if(perfectNumber == Number){
            System.out.println(Number+" mükemmel sayıdır.");
        }else{
            System.out.println(Number+" mükemmel sayı değildir.");
        }
    }
}