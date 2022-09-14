// Numbers of days in a year
//  input year eg. 1980
//  output days eg. 365 Days

import java.util.*;

class DaysInYear 
{
  public static void main (String[] args) 
  {
    Scanner kb=new Scanner(System.in);
    int a=kb.nextInt();
    
    if (a%400==0)
    {
      System.out.println(" 366 Days");
    }
    else
    System.out.println(" 365 Days");
  } 
		
}

// %100
// %400

// class DaysInYear 
// {
//   public static void main (String[] args) 
//   {
//      Scanner kb=new Scanner(System.in);
//         int T=kb.nextInt();
//         for(int i=1;i<=T;i++)
//       {
//           int a=kb.nextInt();
//           if (a%400==0)
//           {
//               System.out.println(" 366 ");
//           }
//           else
//           System.out.println(" 365");
//       } 
  
//   } 
// }