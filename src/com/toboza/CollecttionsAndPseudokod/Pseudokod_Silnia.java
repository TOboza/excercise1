package com.toboza.CollecttionsAndPseudokod;

public class Pseudokod_Silnia {

    /* PSEUDOKOD
Function SILNIA( int n):
    if n = 0 or n = 1
        return 1;

    else :
    int result = 1;
         for i <- 1 to n
             result <- result*i;
         return result;

 */
    public static void main(String[] args) {

        System.out.println("silnia z 5 : " + Silnia(5));

    }
    public static int Silnia(int n){
        if(n == 0 || n==1){
            return 1;
        }else {
            int result = 1;
            for (int i = 1; i<= n;i++){
                result *= i;
            }
            return result;

        }
    }

}
