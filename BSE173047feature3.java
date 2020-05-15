/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse173047feature3;

/**
 *
 * @author Sunduss KD
 */
public class BSE173047feature3 {

boolean SimilarTriangle(int a, int b) 
    {
        if(a==b && a!=0 && b!=0)
        {
            System.out.println("Similar to isosceles triangle ");
            return true;
        }
        else if(a!=b && a!=0 && b!=0)
        {
            System.out.println("Similar to scalene triangle");
            return false;
        }
        else
        {
           System.out.println("NOT A SHAPE");
           return false;
        }
    }


    public static boolean main(String[] args) 
    
    {
        BSE173047feature3 quadrilaterial = new BSE173047feature3();

         int h=10;
         int w=10;

        if (quadrilaterial.SimilarTriangle(h,w))
           return (true);
        else
            return (false);
    }
    
}
