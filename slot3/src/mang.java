
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
public class mang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();  
        }
        //1
        int max = a[0];
        if (max < a[1]) max=a[1];
        if (max < a[2]) max=a[2];
        System.out.println(max);
        
        //2
        float avg = (a[0]+a[1]+a[2])/3;
        float b = avg - a[0];
        float min = Math.abs(b);
        for(int i=1; i<3; i++) {
            float c = avg - a[i];
            float temp = Math.abs(c);
            if (min > temp) min=temp;
        }
        System.out.println(min);
        
    }   
}
