import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int r;
       Scanner inp=new Scanner(System.in);
       r=inp.nextInt();
       double area=3.14*r*r;
       double cevre=2*3.14*r;
        System.out.println(area);
        System.out.println(cevre);

    }
}