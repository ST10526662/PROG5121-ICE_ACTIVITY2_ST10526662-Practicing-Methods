/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_activity2_st10526662;

import java.util.Scanner;

public class ICE_Activity2_ST10526662 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        StudentUtility returns = new StudentUtility();
       System.out.println("Calculate Average: ");
       double avg = returns.averageNumber(25.0, 50.0, 75.0, 100.0);
       System.out.println("Average: " +avg);
       System.out.println("Enter Minutes: ");
       int minutes= inp.nextInt();
       int seconds= returns.convertMinutestoSeconds(minutes);
       System.out.println("Seconds: " +seconds);
       String fullName = returns.GetFullName("Angela","Cebekulu");
       System.out.println("Enter Full Name: " +fullName);
       System.out.println("Is 25 multiple of 5? " +returns.isMultipleOfFive(25));
       System.out.println("Is 77 multiple of 5? " +returns.isMultipleOfFive(77));
       
       
    }
}
