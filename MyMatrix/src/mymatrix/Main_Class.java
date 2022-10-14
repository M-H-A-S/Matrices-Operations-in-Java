
package mymatrix;

import java.util.Scanner;


public class Main_Class {
    
    
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Hello User , Please Enter your name to make a program deal with you!!");
        name = sc.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("              ");
        System.out.println("Hello "+name+ " (◕‿↼) , Welcome to The Matrices World.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("              ");
        //Rules of program 
        System.out.println( "Dear " +name+ ", you have to read the following steps to understand how this program works :- \n ");
        System.out.println(" 1) have enough knowledge about the concept of the operations (If Valid or Not).! ");
        System.out.println(" 2) Select the operation.");
        System.out.println(" 3) Insert Matrices.");
        System.out.println(" 4) NOTE : *If you selected (Addition or Multiplication) Matrices , YOU SHOULD insert Matrix(A) & Matrix(B).");
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("              ");
        
         MyMatrix m = new MyMatrix();
         
         int prt;
        int loop0 =0;
        while (loop0 <15)
        {
            System.out.println("Part (1): Matrices Operations");
            System.out.println("Part (2): Solving the Linear Systems ");
            System.out.println(" ");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Dear " +name+ ", Please ,Select Which part of program ! ? ");
            System.out.println("--------------------------------------------------------------------------------");
        
             prt=sc.nextInt();
             System.out.println(" ");
             
          switch (prt)  
                  {
                      case 1:
          
     
             int loop1=0;
        
        while(loop1 < 15)
        {
        System.out.println("--------------------");
        System.out.println("Part 1 :: The Operations On Matrix :-  ");
        System.out.println("--------------------");
        System.out.println("1) Transpose Matrix. ");
        System.out.println("2) Scalar Multiply Matrix. ");
        System.out.println("3) Addition Matrices. ");
        System.out.println("4) Multiply Matrices. ");
        System.out.println("5) Check if Matrix Symmetric or Not. ");
        System.out.println("6) Check if two Matrices is Equal or Not.");
        System.out.println("7) Valid for Multiplication. ");
        System.out.println("8) Zero Matrix. ");
        System.out.println("9) Identity Matrix.");
        System.out.println("10)Inverse Matrix. ");
      
            
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Enter The Number of Operation:-");
        int op=sc.nextInt();
            
        switch(op)
        {
            case 1:
                System.out.println("Okay, You selected Transpose operation !");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Display_Matrix1();
                m.Transpose_Matrix();
                break;
                
            case 2:
                System.out.println("Okay, You selected Scalar Multiply Matrix operation !");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.scalarMultiply();
                break;
                
            case 3:
                System.out.println("Okay, you selected Addition operation !");
                 System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1(); 
                m.Insert_Matrix2();
                m.Display_Matrix1();
                m.Display_Matrix2();
                m.Addation_Matrix();
                break;
                
            case 4:
                System.out.println("Okay, you selected Multiplication operatio ! ");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Insert_Matrix2();
                m.Display_Matrix1();
                m.Display_Matrix2();
                m.Multiply();
                break;
                
            case 5:
                System.out.println("Okay, you selected If Symmetric or NOT !");
                 System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Display_Matrix1();
                m.isSymmetric();
                break;
                
            case 6:
                System.out.println("Okay, you selected If Matrices Equal or NOT !  ");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Insert_Matrix2();
                m.Display_Matrix1();
                m.Display_Matrix2();
                m.Equals();
                break;  
                
            case 7:
                System.out.println("Okay, you selected If Matrices are valid for multiplication or NOT valid !  ");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Insert_Matrix2();
                m.Display_Matrix1();
                m.Display_Matrix2();
                m.Multiply();
                break;
                
            case 8:
                System.out.println("Okay, you selected Zero Matrix !  ");
                System.out.println("--------------------------------------------------------------------------------");
                m.ZeroMatrix();
                break;
 
            case 9:
                System.out.println("Okay, you selected Identity Matrix  !  ");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Default_Matrix();
                m.Identity_Matrix();
                break;
                
            case 10:
                System.out.println("Okay, you selected Invrese Matrix ! ");
                System.out.println("--------------------------------------------------------------------------------");
                m.Insert_Matrix1();
                m.Display_Matrix1();
                m.Inverse_Matrix();
                break;
             
        }
        
        loop1++;
    }break;        
                    
                      
                 case 2:
                          //test Insert equation in system 
                    System.out.println("Dear "+ name + ", You Selected Solving Linear System ! (Cramer's Method !)");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("--------------------------------------------------------------------------------");
                    MyEquation eq = new MyEquation();
                    eq.Insert_Equation();
                    eq.Display_System();
                    eq.Solve_Linear_Equation();
                          break;
                          
     
        }
             loop0++;
        
        
        
        }
       
    }
  }

  

