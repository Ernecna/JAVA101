import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       double leng,wei;
        System.out.println("Lütfen boy ve kilonuzu giriniz");
        Scanner inp=new Scanner(System.in);
        leng=inp.nextDouble();
        wei=inp.nextDouble();
        double index=wei/(leng*leng);
        System.out.println(index);

    }
}