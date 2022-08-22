 static boolean asal(int sayi) {
        int sayac=0;
      for (int i=2;i<sayi;i++){
          if (sayi%i==0){
              sayac++;
          }
      }if (sayac==0){
          return true;
        }else{
          return false;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayi Girin: ");
        int sayi=input.nextInt();

            if (asal(sayi)&&sayi!=1){
                System.out.println("asal sayi");

            }else{
                System.out.println("Asal sayi degil");
            }
    }
}
