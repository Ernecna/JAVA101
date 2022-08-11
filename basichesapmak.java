import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int firstn,second;
       firstn=inp.nextInt();
       second=inp.nextInt();
        System.out.println("1 TOPLA\n 2 ÇIKAR\n 3 ÇARP\n 4 BÖL");
        int select;
        select=inp.nextInt();
        switch (select){
            case 1:
                System.out.println(firstn+second);
                break;
            case 2:
                System.out.println(firstn-second);
                break;
            case 3:
                System.out.println(firstn*second);
                break;
            case 4:
                System.out.println(firstn/second);
                break;
            default:
                System.out.println("eksik veya hatalı tuşlama");

        }
    }
}


