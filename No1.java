/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

import java.util.Scanner;
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=1,hasil=0,c,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan Deret Fibonacci : ");
        c=sc.nextInt();
        int[] arr=new int[c+1];
        for(int i=1;i<=c;i++){
            a=b;
            b=hasil;
            hasil=hasil+a;
            arr[i]=hasil;
        }
        for(int i=c;1<=i;i--){
            System.out.println(arr[i]+" ");
        }
    }
    
}
