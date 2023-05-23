
import java.io.*;
import java.util.*;

public class Solution {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        int cout=0;
        for ( int i=0; i<n-1; i++){
            for ( int j=i+1; j<n; j++) {
                if(a[i] + a[j]==k) cout++;
            }
        }
        System.out.println(cout);
}
}
