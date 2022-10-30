import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int distance,choice,age;
        double fee=0.0;
        System.out.println("Please enter your distance in kilometers:");
        distance= scanner.nextInt();
        System.out.println("Please select your trip type:\n1. Round trip\n2.One Way");
        choice= scanner.nextInt();
        System.out.println("Please enter your age:");
        age= scanner.nextInt();
        if(choice==1){
          fee=distance*0.10;
          fee=fee-(fee*0.2);
          if(age<12){fee=fee-(fee/2);
          } else if (12<=age && age<24) {
              fee=fee-(fee*0.1);
          } else if (age>65) {
              fee=fee-(fee*0.3);
          }
        }
        else if(choice==2){
            fee=distance*0.10;
            if(age<12){fee=fee-(fee/2);
            } else if (12<=age && age<24) {
                fee=fee-(fee*0.1);
            } else if (age>65) {
                fee=fee-(fee*0.3);
            }
   } else if (age<0 || distance<0 || choice>2) {System.out.println("Wrong value entered.");
        }
System.out.println("Your fee:"+fee+" "+"TL");
    }
}