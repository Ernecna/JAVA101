import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int number;
       int number1;
      Scanner inp=new Scanner(System.in);
      number=inp.nextInt();
      number1=inp.nextInt();
      int res=1;
      for(int i=0;i<number1;i++)
      {
          res=res*number;
      }
        System.out.println(res);
      }
}


