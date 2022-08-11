import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double km = 0.10;
        int wkm, age, type1;
        double sum;
        Scanner inp = new Scanner(System.in);
        wkm = inp.nextInt();
        age = inp.nextInt();
        type1 = inp.nextInt();
        sum = km * wkm;
        if (type1 == 1) {
            if (age < 12) {
                sum = sum * 0.5;

            } else if (age > 12 && age < 24) {
                sum = sum * 0.9;
            } else if (age > 65) {
                sum = sum * 0.7;
            }
            System.out.println("cost is " + sum);
        } else {
            if (age < 12) {
                sum = sum * 0.5;

            } else if (age > 12 && age < 24) {
                sum = sum * 0.9;
            } else if (age > 65) {
                sum = sum * 0.7;
            }
            System.out.println("cost is " + sum * 0.8*2);
        }
    }
}


