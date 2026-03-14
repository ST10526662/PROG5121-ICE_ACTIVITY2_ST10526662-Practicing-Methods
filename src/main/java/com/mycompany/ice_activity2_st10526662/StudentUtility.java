/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_activity2_st10526662;

public class StudentUtility {
    public double averageNumber(double num1, double num2, double num3, double num4){
     return (num1 + num2 + num3 + num4 ) / 4.0;
    }
    public int convertMinutestoSeconds(int minutes){
        return (minutes*60);
    }
    public String GetFullName(String firstName, String Surname){
        return (firstName + ' ' + Surname);
    }
    public boolean isMultipleOfFive(int num6){
        return (num6 % 5==0);
       }


    }
    


