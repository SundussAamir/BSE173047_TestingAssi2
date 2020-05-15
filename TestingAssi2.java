/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingassi2;

/**
 *
 * @author Sunduss KD
 */

// AS IN TESTING WE TAKE BOOLEAN VALUES SO LET THE SQUARE BE TRUE AND RECTANGLE BE FALSE 
public class TestingAssi2 {

    
        boolean checkingtype(int a, int b, double a1, double a2) 
    {

        double ca=0;
        ca=180-a1;
                
        if(a1==0 || a2==0)
        {
              System.out.println("NOT A SHAPE");
              return false;
        }
        
        else  if(a1==180 || a2==1800)
        {
              System.out.println("NOT A SHAPE");
              return false;
        }
        
        else if(a==0 || b==0)
        {
              System.out.println("NOT A SHAPE");
              return false;
        }
        
        else if(a==b && a!=0 && b!=0)
        {
            if(a1==a2 && a1==90)
            {
              System.out.println("SQUARE");
              return true;
            }
            else if(a1<a2 || a1>a2)
            {
               if(a1!=90 && a2!=90)
                {
                    if(ca==a2)
                    {
                     System.out.println("RHOMUS");
                     return true;
                    } 
                    else
                    {
                     System.out.println("NOT A SHAPE");
                     return false;
                    }
                }
               
               else if( a1==90 || a2==90)
                {
                     System.out.println("NOT A SHAPE");
                     return false;  
                }               
                else 
                { 
                    System.out.println("NOT A SHAPE");
                    return false;
               }
            }  
            else 
            { 
                System.out.println("NOT A SHAPE");
                return false;
            }
        }
        else if(a!=b && a!=0 && b!=0)
        {
            if(a1==a2 && a1==90)
            {
              System.out.println("RECTANGLE");
              return true;
            }
            else if(a1<a2 || a1>a2)
            {
               if(a1!=90 && a2!=90)
                { 
                    if(ca==a2)
                    {
                     System.out.println("PARALLELOGRAM");
                     return true;
                    } 
                    else
                    {
                     System.out.println("NOT A SHAPE");
                     return false;
                    }
                }
               
               else if( a1==90 || a2==90)
                {
                     System.out.println("NOT A SHAPE");
                     return false;  
                }               
                else 
                { 
                    System.out.println("NOT A SHAPE");
                    return false;
               }
            }
            else 
            {
                System.out.println("NOT A SHAPE");
                return false;
            }
        }
        else
        {
           System.out.println("NOT A SHAPE");
           return false;
        }
        
    }

    

    public static boolean main(String[] args) 
    {
        TestingAssi2 quadrilaterial = new TestingAssi2();


         double a1=90;
         double a2=90;
         double c=0;
         //swapping greater angle to a1
         if(a1<a2)
         {
          c=a1;
          a1=a2;
          a2=c;
         }

         
         int h=10;
         int w=10;
        if (quadrilaterial.checkingtype(h,w, a1, a2))
           return (true);
        else
            return (false);
        
    }
    
}
