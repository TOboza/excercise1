package com.toboza;

public class Main {

    public static void main(String[] args) {

//   ZADANIE 4
//        for (int i = 0; i < 10; i++) {
//
//            for (int j =0;j<10;j++){
//
//                if(i==0 || i==9 || j==0 || j==9){
//                System.out.print(" * ");
//                }else System.out.print("   ");
//
//
//            }
//            System.out.println();
//        }

        // Zadanie 5

        for (int i = 0; i < 11/2+1; i++) {

            for (int j = 0; j < 11; j++) {

              if((j>=11/2-i) && (j <=11/2+i)){
                  System.out.print("*");

              }else {
                  System.out.print(" ");
              }



            }


            System.out.println();
        }
        for(int i = 0;i< 3;i++){
            for(int j = 0; j <= 11 ; j++){
               if((j > 3) && (j < 7)){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

            }
            System.out.println();
        }

        // ZADANIE KOŁO

        for(int i=0;i<=20;i++){
            for(int j=0;j<=20;j++){

                //if(j)


            }

        }


    }
}

