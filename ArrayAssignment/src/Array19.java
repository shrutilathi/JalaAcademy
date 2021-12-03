/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *19.. Write a function to find the missing number of sorted array of 1 to 100
 * @author shruti
 */
public class Array19 {
    static int ar[]={3,5,8,9,10,20,30,85}; 
    public static void displayMissing(){
           
           System.out.println("given array(already sorted): ");
           for (int j = 0; j < ar.length; j++)
                  System.out.print(ar[j] +" ");
           
           System.out.println(" \nNumbers missing between 1 to 100 in array :  ");
           
           int j=0;
           for(int i=1;i<=100;i++){
                  if(j<ar.length && i==ar[j])
                        j++;
                  else
                        System.out.print(i+" ");
                  
           }
           
    }
      
    
    public static void main(String[] args) {
           displayMissing();       
    }
     
}
