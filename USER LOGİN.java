import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       String username,password;
       Scanner inp=new Scanner(System.in);
       username=inp.nextLine();
       password=inp.nextLine();
       if(username.equals("patika")&&password.equals("java123"))
       {
           System.out.println("giriş yapılıyor");
       }
       else
       {
           System.out.println("ŞİFRE YANLIŞ");
           System.out.println("ŞİFRE OLUŞTURMAK İSTER MİSİNİZ");
           String choice=inp.nextLine();
           switch (choice){
               case "EVET":
                   System.out.println("OLUŞTURMAK İÇİN GİRİN");
                   password=inp.nextLine();
                   break;
            case "HAYIR":
                   System.out.println("NOO");
                   break;
           }
       }
    }
}


