
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 7. Print the smaller and larger number
 *
 * @author shruti smallest number
 */
public class Operator7b {

    public static void main(String[] args) {
        int smallest = 0;
        int large = 0;
        int num;
        int small = 0;
        System.out.println("enter the number");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            num = input.nextInt();
            if (i == 0 && num > 0) {
                small = num;
            }
            if (num < small) {
                small = num;
            }
            System.out.println("The smallest number is"+small);
            //gives the smallest number in n numbers

        }
    }
}
