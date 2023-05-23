/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class baitap {
     //1
    public static int checksnt (int n) {
        if(n<2) return 0;
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return 0;
        }
        return 1;
    }
    
    //2
    public static int tongcs (int n) {
        int s=0, temp;
        while(n!=0) {
            s+= n%10;
            n=n/10;
        }
        return 0;
    }
    
    //3
    public static int tongcsc (int n) {
        int s=0, a;
        while (n!=0) {
            a=n%10;
            if (a%2==0) s+=a;
            n=n/10;
        }
        return 0;
    }
    
    //4
    public static int tongsnt (int n) {
        int s=0, a;
        while (n!=0) {
            a=n%10;
            for (int i=2; i<=Math.sqrt(a);i++) {
                if (a%i==0) return 0;
                else s+=a;
            }
            n=n/10;
        }
        return 0;
    }
    
    //5
    public static int daonguoc (int n) {
        int temp=0, b=n;
        while (n>0) {
            temp = temp *10 + n%10;
            n/=10;
        }
        return b==temp;
    }
}
