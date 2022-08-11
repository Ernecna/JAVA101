import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int year;
    Scanner inp=new Scanner(System.in);
    year= inp.nextInt();
    if(year%100==0)
    {
        if(year%400==0)
        {
            System.out.println("ARTIK YIL");
        }
        else
        {
            System.out.println("değil");
        }

    }
    else
    {
        if(year%4==0)
        {
            System.out.println("artık");
        }
        else
        {
            System.out.println("artık değil");
        }
    }

    }
}


