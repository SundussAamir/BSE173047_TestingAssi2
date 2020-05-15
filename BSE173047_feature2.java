/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse173047_feature2;

/**
 *
 * @author Sunduss KD
 */
public class BSE173047_feature2 {

    /**
     * @param args the command line arguments
     */
   
       
        boolean isSimilarTo(int a, int b) 
        {
           if(a==b && a!=0 && b!=0)
           {
               System.out.println("Similar to Square");
               return true;
            }
            else if(a!=b && a!=0 && b!=0)
            {
               System.out.println("Similar to Rectangle");
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
         BSE173047_feature2 quadrilaterial = new BSE173047_feature2();

         int h=10;
         int w=10;

        if (quadrilaterial.isSimilarTo(h,w))
           return (true);
        else
            return (false);
        
    }


}
