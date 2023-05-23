
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class baitap2 {
     public static boolean prime (long n) {
        if (n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;  
    }
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        long s=0, count=0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(prime(a[i])) s+=a[i];
            count++;
        }
         long avr = s/count;
         System.out.println(avr);
   
         System.out.printf("%.3l", s);
   
     }
}
