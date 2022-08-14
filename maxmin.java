import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int nofdata;
        int min;
        int temp;
        Scanner inp=new Scanner(System.in);
        System.out.println("KAÇ SAYI GİRECEKSİNZ");
        nofdata=inp.nextInt();
        System.out.println("İLK DEĞERİ GİRİNİZ");
        min=inp.nextInt();
        while(nofdata-1>0)
        {
           temp=inp.nextInt();
           if (temp<min)
           {
               min=temp;
           }
           nofdata--;

        }
        System.out.println(min);
    }
}


