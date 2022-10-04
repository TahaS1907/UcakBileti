import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mesafe,tercih,yas;
        double ucret=0.0;
        System.out.println("Lütfen gideceğiniz mesafeyi kilometre cinsinden giriniz:");
        mesafe= scanner.nextInt();
        System.out.println("Lütfen yolculuk tipinizi seçiniz:\n1.Gidiş-Dönüş\n2.Tek Yön");
        tercih= scanner.nextInt();
        System.out.println("Lütfen yaşınızı giriniz:");
        yas= scanner.nextInt();
        if(tercih==1){
          ucret=mesafe*0.10;
          ucret=ucret-(ucret*0.2);
          if(yas<12){ucret=ucret-(ucret/2);
          } else if (12<=yas && yas<24) {
              ucret=ucret-(ucret*0.1);
          } else if (yas>65) {
              ucret=ucret-(ucret*0.3);
          }
        }
        else if(tercih==2){
            ucret=mesafe*0.10;
            if(yas<12){ucret=ucret-(ucret/2);
            } else if (12<=yas && yas<24) {
                ucret=ucret-(ucret*0.1);
            } else if (yas>65) {
                ucret=ucret-(ucret*0.3);
            }
   } else if (yas<0 || mesafe<0 || tercih>2) {System.out.println("Hatalı değer girildi.");
        }
System.out.println("Ücretiniz:"+ucret+" "+"TL");
    }
}