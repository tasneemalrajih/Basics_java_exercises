package org.example.Exday1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Ex: 1
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a day number: ");
//        System.out.println();

//        int day = sc.nextInt();

//        if (day >= 1 && day <= 5) {
//            System.out.println("Work day");

//        } else if (day == 6 || day == 7) {
//            System.out.println("Off day");
//        } else {
//            System.out.println("Invalid input");
//        }
//  ....................................................................
//       Ex: 2
//       Scanner sc = new Scanner(System.in);

//       System.out.println("Enter a day number: ");
//       System.out.println();

//       int day = sc.nextInt();

//        switch (day){
//            case 1 :
//              System.out.println("Work day 1");
//          break;
//            case 2 :
//             System.out.println("Work day 2");
//             break;
//            case 3  :
//              System.out.println("Work day 3");
//              break;
//            case 4 :
//               System.out.println("Work day 4");
//               break;

//            case 5 :
//               System.out.println("Work day 5");
//               break;

//            case 6  :
//               System.out.println("Off day 6");
//               break;

//            case 7 :
//              System.out.println("Off day 7");
//              break;

//            default : System.out.println("Not a day");
//        }

//  ....................................................................
//       Ex: 3

//      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a day number: ");
//       System.out.println();
//      int day = sc.nextInt();

//      if(day >= 1 && day <= 4 || day ==7){
//          System.out.println("Work day ");
//      } else if(day ==5 || day ==6 ){
//          System.out.println("Off day ");
//      }else{
//          System.out.println("Invalid input");
//      }
//  ....................................................................
//       Ex: 4
//        Scanner sc = new Scanner(System.in);
//
//       System.out.println("Enter a  number: ");
//       System.out.println();
//
//       int x = sc.nextInt();
//       System.out.println(x % 2 == 0 ? "Even" : "Odd");

//  ....................................................................
//       Ex: 5
//        Scanner sc = new Scanner(System.in);
//        int x = (int) (Math.random() * 10);
//        int y = (int) (Math.random() * 10);
////       System.out.println("What's "+x +" *" +y+ "?");
////        or
//        System.out.printf("What's %d * %d ?", x, y);
//         int answer = sc.nextInt();
//        if (answer == x *y) {
//            System.out.println("correct");
//        } else {
//            System.out.println("Wrong");
//        }

//  ....................................................................
//       Ex: 6
//       int x= 1;
//        System.out.print("x=");
//        while (x <= 10){
//
//            System.out.print("\t"+x);
//          x+=1;
//        }
//        System.out.println();
//        System.out.println("................");
//        System.out.print("i=");
//        for (int i=0 ;i<= 10;i++){
//
//            System.out.print("\t"+i);
//  ....................................................................
//       Ex: 7
//        for (int x=1 ; x<= 10 ; x++) {
//            for (int i = 1; i <= 10; i++) {
//
//                System.out.print("\t" + i);
//            }
//            System.out.println();
//        }
//  ....................................................................
//       Ex: 8
//        Scanner sc = new Scanner(System.in);
//        int x = (int) (Math.random() * 10);
//        int y = (int) (Math.random() * 10);
//        System.out.printf("What's %d * %d ?", x, y);
//         int answer = sc.nextInt();
//
//         while (answer == x*y){
//              x = (int) (Math.random() * 10);
//              y = (int) (Math.random() * 10);
//             System.out.printf("What's %d * %d ?", x, y);
//              answer = sc.nextInt();
//         }
//         System.out.println("Gime Over!!");
//  ....................................................................
//       Ex: 9
//        Scanner sc = new Scanner(System.in);
//        int x = (int) (Math.random() * 10);
//        int y = (int) (Math.random() * 10);
//        System.out.printf("What's %d * %d ?", x, y);
//         int answer = sc.nextInt();
//
//         while (answer != x*y){
//
//             System.out.println("Tray Agen");
//             System.out.printf("What's %d * %d ?", x, y);
//              answer = sc.nextInt();
//         }
//         System.out.println("Correct Answer");
//  ....................................................................
//       Ex: 9
//        Scanner sc = new Scanner(System.in);
//        int correct = 0;
//        for(int i=1 ; i<= 5 ;i++){
//        int x = (int) (Math.random() * 10);
//        int y = (int) (Math.random() * 10);
//        System.out.printf("What's %d * %d ?", x, y);
//         int answer = sc.nextInt();
//        if (answer == x *y) {
//            System.out.println("correct");
//            correct++;
//
//        } else {
//            System.out.println("Wrong");
//        }
//        }
//        System.out.println("Total Correct Answer is : "+correct +" out of 5");
//  ....................................................................
//       Ex: 10

//        Scanner sc = new Scanner(System.in);
//        int correct = 0;
//
//        for(int i=1 ; i<= 5 ;i++) {
//            int x = (int) (Math.random() * 10);
//            int y = (int) (Math.random() * 10);
//            for (int j = 1; j <= 3; j++) {
//                System.out.printf("What's %d * %d ?", x, y);
//                int answer = sc.nextInt();
//                if (answer == x * y) {
//                    System.out.println("correct");
//                    correct++;
//                    break;
//
//                } else {
//                    System.out.println("Wrong");
//                }
//            }
//        }
//        System.out.println("Total Correct Answer is : "+correct +" out of 5");
//  ....................................................................
//       Ex: 11
//       String x = "Tasneem";
//       String mobile = "0594485513";
//        System.out.println(x);
//        char y = x.charAt(3);
//        System.out.println(y);
//        System.out.println(mobile.length());
//        System.out.println(x.substring(0,4));
//        System.out.println(x.toLowerCase());
//        System.out.println(x.toUpperCase());
//        System.out.println(mobile.startsWith("05"));
//        System.out.println(x.startsWith("s"));
//  ....................................................................
//       Ex: 12
//      Scanner sc = new Scanner(System.in);
//
//         System.out.println("Enter a New Password: ");
//        String Password = sc.nextLine();
//        if (Password.length()< 8){
//            System.out.println("Week Password !!");
//        }else{
//            int digitCount =0;
//            int uperCount =0;
//            for (int i=0; i<Password.length();i++){
//                char c= Password.charAt(i);// تعديني الحرف
//                if(Character.isUpperCase(c)){
//                    uperCount++;
//                } else if (Character.isDigit(c)) {
//                    digitCount++;
//                }
//            }
//            if(uperCount<2 || digitCount<2){
//                System.out.println("Week Password !!");
//            }else {
//                System.out.println("Strong Password");
//            }
//        }
//  ....................................................................
//       Ex: 13
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Phone Number: ");
//        String Phone = sc.nextLine();
//        if (Phone.length() < 10) {
//            System.out.println("Sorry Not Correct Phone Number !!");
//        } else if (Phone.startsWith("05")){
//            System.out.println("The Number Starting 05 ");
//        } else {
//            int digitCount = 0;
//
//            for (int i = 0; i < Phone.length(); i++) {
//                char c = Phone.charAt(i);// تعديني الحرف
//                if (Character.isDigit(c)) {
//                    digitCount++;
//                }
//            }
//
//            if (digitCount == 10 ) {
//                System.out.println("Good Phone Number ");
//            } else {
//                System.out.println("Not Valid !!");
//            }
//        }
//  ....................................................................
//       Ex: 14
//        Scanner sc = new Scanner(System.in);
//
//       System.out.println("Enter The Number Of Students: ");
//       int n = sc.nextInt();
//       double[] marks = new double[n];
//        double best =0;
//       for(int i =0; i< n ; i++){
//           System.out.println("Enter std. Mark: ");
//           marks[i] = sc.nextDouble();
//           if(marks[i]>best){
//               best = marks[i];
//           }
//       }
//        for (int i = 0; i <marks.length ; i++) {
//            if(marks[i] >= best-10){
//                System.out.println(marks[i]+ "=> A");
//            } else if (marks[i]>= best-20) {
//                System.out.println(marks[i]+"=> B");
//            } else if (marks[i]>=best-30) {
//                System.out.println(marks[i]+"=> C");
//            }
//        }
//
//  ....................................................................
//       Ex: 15
//          int[] xArr= {10,20,30};
//          int[] yArr = xArr;
//          // معناها اخذ نسخه من x و بنفس الطول
//          int[] zArr = Arrays.copyOf(xArr,xArr.length);
//          //  طبعتها بهذا الشكل عشان ياخذ القيم الي داخل xArr
//        System.out.println(Arrays.toString(xArr));
//        System.out.println(Arrays.toString(yArr));
//        System.out.println(Arrays.toString(zArr));
//        // هذي الطريقة يطبع لي العنوان
//        System.out.println(xArr);
//        //   روح للاندكس رقم 1 ويزود على القيمه نفسها 3
//        yArr[1] +=3;
//        xArr[1] +=3;
//        System.out.println(Arrays.toString(xArr));
//        System.out.println(Arrays.toString(yArr));
//        var sc= new Scanner(System.in);
//        System.out.println("Enter weight and height: ");
//        double w= sc.nextDouble();
//        double h= sc.nextDouble();
//
//        double bmi= calcDmi(w,h);
//        String status = getStatus(bmi);
//        System.out.println("Your BMI: "+bmi+","+status);
//  ....................................................................
//       Ex: 16
//        var statuase = getStatus(23,20,35,15);
//        System.out.println(Arrays.toString(statuase));
//  ....................................................................
//       Ex: 17
//        Patient p1 = new Patient("Tasneem",60,160);
//        Patient p2 = new Patient("Tasneem",60,160);
//        System.out.println(p1.name);
//        System.out.println(p1.getStatus());
//        System.out.println(p1.height);
//        // راح يطبع العنوان
//        System.out.println(p1);
//  ....................................................................
//       Ex: 18
//        Student.fullMark=100;
//
//        var s1 = new Student("Tasneem", 20);
//        System.out.println(s1.getGrade());
//        System.out.println(s1.getPercent());
//        System.out.println(s1.getMark());
//        System.out.println(s1.name);


        }
     public static double calcDmi(double weight,double height){
        return weight/Math.pow(height/100,2);
     }
     public static String getStatus(double bmi){
        if(bmi<18.5) return "Underweigh";
        else if (bmi<25)return "Normal";
        else if (bmi<30) return "Overweight";
        else return "obese";
     }
     //                           النقاط عشان برسل له مجموعة من الأرقام
    public static String[] getStatus(double... bmis){
        var statuase = new String[bmis.length];
        for(int i=0;i<bmis.length;i++) {
            var bmi = bmis[i];
            if (bmi < 18.5) statuase[i]= "Underweigh";
            else if (bmi < 25) statuase[i]= "Normal";
            else if (bmi < 30) statuase[i]= "Overweight";
            else statuase[i]= "obese";
        }
        return statuase;
    }
    }




