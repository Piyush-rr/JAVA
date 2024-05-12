import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
 //get bit ::the 3rd bit(position=2) of a number n.  n=0101 

    //    int n=5;   //0101
    //    int pos=0;
    //     int bitMask=1<<pos;

    //     if((bitMask & n )==0){
    //         System.out.println("bits is zero ");
    //     }else{
    //         System.out.println("bits is one");
    //     }

 //set bit::  the 2nd bit (position=1) of a number n=0101

        // int n=5;
        // int pos=1;
        // int bitMask =1<<pos;
        // int finalResult=(bitMask | n);
        // System.out.println(finalResult);

//clear bit::  the 3rd (position=2) of a number n=0101

        // int n=5;
        // int pos=2;
        // int bitMask=1<<pos;
        // int firstNot=~(bitMask);
        // int finalResult=(firstNot & n);
        // System.out.println(finalResult); 

//update bit:: update the 2nd bit (position =1) of a number n to 1. n=0101
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask=~(bitMask);
            int newNumber=newBitMask &n;
            System.out.println(newNumber);
        }
    }
}

