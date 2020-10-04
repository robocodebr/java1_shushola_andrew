package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner s = new Scanner(System.in);

//        if (i % 2 == 0)
//        System.out.println("even");
//        else
//        System.out.println("odd");
//
//        Scanner s = new Scanner(System.in);
//        int i = s.nextInt();
//        int i2 = 0;
//
//        for(int conter=1;conter<=i; conter++)
//        {
//            i2++;
//            if(i2==7){ i2 = 0;}
//        }
//
//        switch(i2){
//            case 0:
//                System.out.println("mon");
//                break;
//            case 1:
//                     System.out.println("tus");
//                     break;
//            case 2:
//                         System.out.println("wed");
//                         break;
//            case 3:
//            System.out.println("thur");
//                break;
//            case 4:
//                System.out.println("fri");
//                break;
//            case 5:
//                System.out.println("sat");
//                break;
//            case 6:
//                System.out.println("sun");
//                break;
//
//
//Random random = new Random();
//int i = 0;
//do {
//    System.out.println(random.nextInt(100));
//    i++;
//}
//while(i<10);
//        Random random= new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(100)-50);
//        }

        int i   =  s.nextInt();
        int o   =  s.nextInt();
        int sum = 0;
        while (i<=o){
            sum += i;
//            if(i%2 ==0){
            System.out.println(i);



            i++;
    }
        System.out.println(sum );
}}