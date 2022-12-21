import java.util.Scanner;

/**
 * first
 */
public class first {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a,b,d=0;
       System.out.println("Lütfen birinci notu girin : ");
       Scanner scn= new Scanner(System.in);
       a=scn.nextInt();
       System.out.println("Lütfen ikinci notu girin : ");
       b=scn.nextInt();

       final float  c=(a+b)/2;
       System.out.println("sonuç "+c);

       boolean x= c>60;

       while(x==true){
        d=1;
        System.out.println("geçtiniz");
        break;

       }
       while(x==false){
        d=0;
        System.out.println("kaldınız");
        break;

       }

       switch (d){
        case 0:
        System.out.println("kaldınız");
        break;
        case 1:
        System.out.println("geçtiniz");
        break;




       }
       

    
      

    }
}