import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    static boolean asal(int number, int tempNumber) {

        if (number == 1){
            return true;
        } if (tempNumber != number){
            if (tempNumber % number == 0){
                return false;
            }
        }
        return asal(number-1,tempNumber);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        int tempNumber = number;

        if (asal(number,tempNumber) == true) {
            System.out.println(tempNumber + " bir asal sayıdır.");
        }else {
            System.out.println(tempNumber + " bir asal sayı değildir!!!");
        }
    }
}
