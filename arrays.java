// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         // int[] marks=new int[3];
//         // second way of define the arrays
//         int marks[]={97,98,92};
//         // marks[0]=97;//eng
//         // marks[1]=98;//chem
//         // marks[2]=92;//eng
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }



// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int numbers[]=new int[size];
//         for(int i=0;i<size;i++){
//            numbers[i]=sc.nextInt();
//         }
//         System.out.println("TO find the indexing ");
//         int x=sc.nextInt();
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==x){
//                 System.out.println("X is found at index " +i);
//             }
//         }
//         }
//     }



// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int numbers[]=new int[size];

//         //input
//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }
//         //output
//         for(int i=0;i<size;i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }


import java.util.*;
public class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        // input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            else if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Largest numbers is :"+max);
        System.out.println("Smallest numbers is :"+min);
    }
}

