import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int number1, number2;
        int ebob=0;
        Scanner inp=new Scanner(System.in);
        number1=inp.nextInt();
        number2=inp.nextInt();
        if (number1 > number2) {
            for (int i = 1; i <= number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }

        } else {
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }
        }
        System.out.println(ebob);
    }
}


