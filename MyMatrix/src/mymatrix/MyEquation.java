
package mymatrix;

import java.util.Scanner;


public class MyEquation {
 

          public int no_of_variable;
          public      int no_of_equation;
          public float Equations[][];
          public float tempX[];
          public float tempY[];
          public float tempZ[];
          public float Right_Hand_Side[][];

    public MyEquation(int no_of_variable, int no_of_equation, float[][] Equation, float[][] Right_Hand_Side) {
        this.no_of_variable = no_of_variable;
        this.no_of_equation = no_of_equation;
        this.Equations = Equation;
        this.Right_Hand_Side = Right_Hand_Side;
    }

    public int getNo_of_variable() {
        return no_of_variable;
    }

    public void setNo_of_variable(int no_of_variable) {
        this.no_of_variable = no_of_variable;
    }

    public int getNo_of_equation() {
        return no_of_equation;
    }

    public void setNo_of_equation(int no_of_equation) {
        this.no_of_equation = no_of_equation;
    }

    public float[][] getEquation() {
        return Equations;
    }

    public void setEquation(float[][] Equation) {
        this.Equations = Equation;
    }

    public float[][] getRight_Hand_Side() {
        return Right_Hand_Side;
    }

    public void setRight_Hand_Side(float[][] Right_Hand_Side) {
        this.Right_Hand_Side = Right_Hand_Side;
    }
          
          public  MyEquation(){
              
          }
          
           public void Insert_Equation()
           {
            
              
               
               Scanner sc = new Scanner(System.in);
               
               System.out.println("NOTE : To apply Cramer's Rule (Number_of_Variables == Number_of_Equations) in the Linear System !!  ");
               System.out.println("--------------------------------------------------------------------------------");
               System.out.println("--------------------------------------------------------------------------------");
               System.out.println("Enter the number of variable in the equations ");
               no_of_variable=sc.nextInt();
               System.out.println("Enter number of equations");
               no_of_equation=sc.nextInt();
               
               if(no_of_variable==no_of_equation)
               {
                   
                   
                    Equations=new float [no_of_variable][no_of_equation];
                    Right_Hand_Side=new float[no_of_equation][1];
                   System.out.println("Please , Enter Coafficient of in order like this statment  3X + 2Y + 5z = C :- ") ;
                   int o=1;
                   for(int i=0;i<no_of_equation;i++)
                   {     
                       System.out.println("Coafficient of Equation ("+ (o)+")");
                         for(int j=0; j<no_of_variable; j++)

                         {

                            Equations[i][j] = sc.nextFloat();
                         }
                         System.out.println("Enter Right Hand Side VALUE :-  ");
                             Right_Hand_Side[i][0]=sc.nextFloat();
                             o++;
                   }
                   
                
                   
                   
                   
                   
                   
               }
               
               else 
               {
                   System.out.println("System Down! , YOU Must insert (Number_of_Variables == Number_of_Equations)!! ??  ");
               }
               
               
               
           }
           
           
              public void Display_System(){ 
                   
                   char []charac = {'x', 'y', 'z'};
                    for(int i=0; i<no_of_variable; i++)
                     {
                            for(int j=0; j<no_of_equation; j++)
                                {
                                     System.out.print(" "+Equations[i][j] +charac[i]);
                                }
                        System.out.print("  "+ charac[i]);
                        System.out.print("  =  "+ Right_Hand_Side[i][0]);
                        System.out.println();

                    }
                   
               }
              
              
           public void SwapRows()
           {
               //Three type of swap :- 
               //RHS -> X 
               //RHS -> Y

               
           }
           
           
           
           
           
           
           
           
           
           
           public void Solve_Linear_Equation()
           {    //final result 
               float X;
               float Y;
               float Z;
               //det of all 
               float Det_A=0;
               float Det_X=0;
               float Det_Y=0;
               float Det_Z=0;
               
                tempX=new float [3];
                tempY=new float [3];
                tempZ=new float [3];  
               
               //Det A
                for(int i = 0; i < no_of_variable; i++)
                {
	        Det_A = Det_A + (Equations[0][i] * ( Equations[1][(i+1)%no_of_variable] * Equations[2][(i+2)%no_of_variable] - Equations[1][(i+2)%no_of_variable] * Equations[2][(i+1)%no_of_variable]) );
		}
                /*------------------------------------------------------------------------------------------------------------*/
               
                // Swap column X 
                           
                
                //naqel x
                for (int i=0;i<no_of_variable;i++)
                {
                   tempX[i]= Equations[i][0];
                   Equations[i][0]=Right_Hand_Side[i][0];
                }
                
                //Det X 
                    for(int i = 0; i < no_of_variable; i++)
                    {
                    Det_X = Det_X + (Equations[0][i] * ( Equations[1][(i+1)%no_of_variable] * Equations[2][(i+2)%no_of_variable] - Equations[1][(i+2)%no_of_variable] * Equations[2][(i+1)%no_of_variable]) );
                    }
                    
                 // tarje3 X
                for (int i=0;i<no_of_variable;i++)
                {
                    Equations[i][0]=tempX[i];
                }
                
                
                    // Swap column Y 
                //naqel Y 
                    for (int i=0;i<no_of_variable;i++)
                {
                    tempY[i]=Equations[i][1];
                    Equations[i][1]=Right_Hand_Side[i][0];
                    
                }
                    
                //------------------------------------------------------------------------------------------------------------
                //Det Y
                
                    
                for(int i = 0; i < no_of_variable; i++)
                {
                Det_Y = Det_Y + (Equations[0][i] * ( Equations[1][(i+1)%no_of_variable] * Equations[2][(i+2)%no_of_variable] - Equations[1][(i+2)%no_of_variable] * Equations[2][(i+1)%no_of_variable]) );
		}
                
                //tarje3 Y 
                for (int i  = 0 ; i<no_of_variable; i++)
                {
                    Equations[i][1]=tempY[i];
                }
                
                //------------------------------------------------------------------------------------------------------------
                // naqel Z 
                for(int i=0 ; i<no_of_variable;i++)
                {
                    tempX[i]=Equations[i][2];
                    Equations[i][2]=Right_Hand_Side[i][0];
                }
                
                //Det Z 
                for(int i = 0; i < no_of_variable; i++)
                {
	           	Det_Z = Det_Z + (Equations[0][i] * ( Equations[1][(i+1)%no_of_variable] * Equations[2][(i+2)%no_of_variable] - Equations[1][(i+2)%no_of_variable] * Equations[2][(i+1)%no_of_variable]) );
				} 
                
                //tarje3 Z
                for (int i =0 ;i<no_of_equation;i++)
                {
                  Equations[i][2]=tempZ[i];  
                }
                
                X=Det_X/Det_A;
                Y=Det_Y/Det_A;
                Z=Det_Z/Det_A;
                
              
                System.out.println("----------------------------------------------------------");
                System.out.println("The Result :-");
                 System.out.println("Det A = "+ Det_A);
                 System.out.println("Det Ax = "+ Det_X);
                  System.out.println("Det Ay = "+ Det_Y);
                  System.out.println("Det Az = "+ Det_Z);
                System.out.println("-------------------");
                
                System.out.println(" The value of X = "+ X);
                System.out.println(" The value of Y = "+ Y);
                System.out.println(" The value of Z = "+ Z);
                
                
              
                
                
                
           }

    
           

    
           
           
           
           }
       
        
       
       
      

