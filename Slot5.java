/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package slot5;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Slot5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex = sc.nextInt();
        switch(ex){
            case 1:
                for(int i=2; i<=10;i+=2){
                    System.out.println(i + " ");
                }
            case 2:     
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
                System.out.println(" ");
                System.out.println(arr[n-1]);
	}
    }
}
    

