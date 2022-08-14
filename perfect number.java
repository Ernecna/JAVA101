import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0)
            sum += i;
        }
        if (sum == number) {
            System.out.println("PERFECT NUMBER");
        }
    }
}


