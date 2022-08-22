import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
    String menu ="1- Toplama\n"
            + "2-Çıkarma\n"
            + "2-BoL\n"
            + "2-CARP\n"
            + "USLU SAYI\n"
            + "MOD\n"
            + "ALAN CEVRE\n"
            + "0-EXIT\n";
       Scanner inp=new Scanner(System.in);
       int choice=inp.nextInt();
       int wnumber1,wnumber2;
       wnumber1= inp.nextInt();
       wnumber2=inp.nextInt();
       while(choice!=0)
       {
            if(choice==1)
            {

            }
            else if(choice==2)
            {

            }
            else if(choice==3){

            }
            else if(choice==4){

            }
            else if(choice==5){

            }
            else if(choice==6){

            }
            else if(choice==7){

            }
            else if(choice==0) {
                System.out.println("ÇIKIŞ YAPTINIZ");
            }
            else
           System.out.println("hatalı");
       }


           System.out.println("AGAİN ENTER THE CHOİCE");
           choice=inp.nextInt()
       }


    }

}

