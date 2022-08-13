import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int wnumber;
        Scanner inp = new Scanner(System.in);
        wnumber = inp.nextInt();
        double res = 0.0;
        for (double i = 1; i <= wnumber; i++) {
            res += (1 / i);

        }
        System.out.println(res);
    }
}


