import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("[Wellcome to My Own Calculator]\n");
    System.out.print("[Made By : Santiago BSIT 1-2]\n\n");
    
   
    System.out.println("Enter 1 : + ");
    System.out.println("Enter 2 : - ");
    System.out.println("Enter 3 : x ");
    System.out.println("Enter 4 : / or Division\n");

    System.out.print("Enter Your Choice to Procced : ");
    int choice =s.nextInt();
    
    if (choice == 1){
        System.out.print("Enter First Number : ");
        int add =s.nextInt();
        System.out.print("Enter Scond Number : ");
        int add1 =s.nextInt();
        
        int total = add + add1;
        System.out.println("Total is  : " + total);
    }
        
    else if (choice == 2){
        System.out.print("Enter First Number : ");
        int minus =s.nextInt();
        System.out.print("Enter Scond Number : ");
        int minus1 =s.nextInt();
        
        int total1 = minus - minus1;
        System.out.println("Total is  : " + total1);
    }
    
    else if (choice == 3){
        System.out.print("Enter First Number : ");
        int times =s.nextInt();
        System.out.print("Enter Scond Number : ");
        int times1 =s.nextInt();
        
        int total2 = times * times1;
        System.out.println("Total is  : " + total2);
    }

        s.close();
    }
}