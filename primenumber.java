import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int wnumber;
        Scanner inp = new Scanner(System.in);
        //wnumber=inp.nextInt();
        int check = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 1) {

            }
            else {
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        check++;
                    }
                }
                            if (check == 2) {
                        System.out.print(" "+i);
                            }
                check = 0;
            }


        }
    }
}


