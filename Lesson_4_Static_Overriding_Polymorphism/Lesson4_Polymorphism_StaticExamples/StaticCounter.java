/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_StaticExamples;

/**
 *
 * @author anjali
 */
public class StaticCounter {    
    private static int counter = 0;
    
    public static int getCount() {
        return counter;
    }
    
    public static void increment(){
      counter++;
    }
}
