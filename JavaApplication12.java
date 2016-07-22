/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter array size: ");
int size = input.nextInt();
int[] crr_array = new int[size];
int[] new_array= new int[size];
int[] times = new int[size];


System.out.println("Enter array elements: ");
for (int J = 0; J< crr_array.length; J++) {
    crr_array[J] = input.nextInt();
    times[J] = 1;
}



for (int j = 0; j < crr_array.length; j++) {

    for (int J = j; J < crr_array.length; J++) {

        if (crr_array[j] == crr_array[J] && j != J) {

             new_array[J] = crr_array[J];
            times[J]++;
        }


    }

}
    }
    }
}
