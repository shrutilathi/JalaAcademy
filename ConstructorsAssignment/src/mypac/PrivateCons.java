/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypac;

/**
 *If you make any class constructor private, 
 * you cannot create the instance of that class from outside the class.
 * @author shruti
 */
class Private{  
private Private(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class PrivateCons {
    public static void main(String args[]){  
//   Private obj=new Private();//Compile Time Error
    }
}
