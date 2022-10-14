package mymatrix;
import java.util.Scanner;
import java.io.*;


public class MyMatrix {
    public int rows;
    public int rows2;
    public int columns;
    public int columns2;
    
    public float  matrix1[][];
    public float matrix2[][];

     public float Result[][];
     
     
   
     //defult constractor 
    public MyMatrix() {
    }

    public MyMatrix(int rows, int rows2, int columns, int columns2, float[][] matrix1, float[][] matrix2, float[][] Result) {
        this.rows = rows;
        this.rows2 = rows2;
        this.columns = columns;
        this.columns2 = columns2;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.Result = Result;
    }
    
    //Insert the Matrix-1
    public void Insert_Matrix1()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the (Matrix-A) :-  ");
        System.out.println("Rows: ");
        rows=sc.nextInt();
        System.out.println("columns: ");
        columns=sc.nextInt();
        matrix1= new float[rows][columns];
        System.out.println("Enter the elements of the (Matrix-A) :-  ");
          
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix1[i][j] = sc.nextFloat();
            }
        }        
    }
    
     //Insert the Matrix-2
    public void Insert_Matrix2(){
        //--------------------------------Matrix B -----------------------------------//
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size  of the (Matrix-B) :-  ");
        System.out.println("Rows: ");
        rows2=sc.nextInt();
         System.out.println("columns: ");
        columns2=sc.nextInt();
        System.out.println("Enter the elements  of the (Matrix-B) :-  ");
     
        matrix2= new float[rows2][columns2];
        
        
           for (int i = 0; i < rows2; i++)
        {
            for (int j = 0; j < columns2; j++)
            {
                matrix2[i][j] =sc.nextFloat();
            }
        }  
        
    }
   
     //Display of Matrix-1

    public void Display_Matrix1()
    
   {
        System.out.println("The Elements of (Matrix-A-) is :- ");
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                 System.out.print("\t" + matrix1[i][j]);
               
            }
            System.out.println();
        }  
        
       
    }
   
     //Display of Matrix-2
    public void Display_Matrix2()
    {
         System.out.println("The Elements of (Matrix-B-) is :- ");
         for (int i = 0; i < rows2; i++)
        {
            for (int j = 0; j < columns2; j++)
            {
                System.out.print("\t" + matrix2[i][j]);
           
            }
            System.out.println();
        } 
    }
    
    
    public void Addation_Matrix()

    {
       
        if(rows==rows2&&columns==columns2)
        {
        Result= new float[rows][columns];
        for(int i=0 ;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                Result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
   
                
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("The Addition of ( Matrix A + Matrix B ) = ");
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0 ; j<columns;j++)
            {
                System.out.print("\t" + Result[i][j]);
            }
            System.out.println();
        }
    }
        else 
            System.out.println(" ! ooops, Erorr: The Size of Matrix-A- And Size of Matrix-B- are NOT equal !!! ");
    }
    
    
    public void Transpose_Matrix()
    {
        
        System.out.println("The Matrix before Transpose ");
        Result= new float[columns][rows];
  
       for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
       //Transpose Action 
         for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                Result[j][i]=matrix1[i][j];
            }
        }
         
        //Display the after transpose
       System.out.println("The Transpose of Matrix-1- is :");
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                System.out.print(Result[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
      

    public void isSymmetric() 
    {
        Result= new float[rows][columns];
         boolean eq = true;
	  System.out.println("Matrix Transpose : ");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            Result[j][i] = matrix1[i][j];
        }
    }
    for (int i = 0; i < columns; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            System.out.print(Result[i][j]+"\t");
        }  	
        System.out.println();
    }
    for (int i = 0; i < columns; i++)
    {
        for (int j = 0; j < rows; j++)
        {
        	if(matrix1[i][j]!=matrix1[j][i])
        	{
        		eq= false;
        		break;
        	}
        }
    }
    if(eq==false)
    {
    	System.out.println("Matrix is NOT symmetric"); 
    }
    else 
    {
    	System.out.println("Matrix is symmetric");
    }
  
    }

    
    public void scalarMultiply()
    {
        System.out.println("The Matrix before * k  ");
        Result= new float[columns][rows];
  
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("Enter the Scalar that you need to multiply :- ");
        Scanner sc=new Scanner(System.in);
        int k =sc.nextInt();
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                Result[i][j]=k*matrix1[i][j];
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                 System.out.print(Result[i][j]+"\t");
            }
            System.out.println();
        }
        
        
    }
    
    
    public void Multiply()
    {
        if(columns==rows2)
        {
            Result= new float[rows][columns];
            
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns2;j++)
                {
                    for(int k=0;k<rows2;k++)
                    {
                        Result[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            System.out.println("The result of Matrixs A*B is = :- ");
            
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns2;j++)
                {
                    System.out.print(Result[i][j] + "\t");
                }
                System.out.println();
            }
            
            System.out.println("Your Multiplication is VALID ! ");
        }
        else 
            System.out.println("Erorr! The multiplication of the matrixes  is NOT valid , Check The size(1stColumns(M1) == 1stRow(M1) ) !!! ");
            
    }
    
    public void Equals()  
    {
        if(rows==rows2&&columns==columns2)
        {
        boolean eq =true;
                 for (int i = 0; i < rows; i++)
	    {
	        for (int j = 0; j < columns; j++)
	        {
	        	if(matrix1[i][j]!=matrix2[i][j])
	        	{
	        		eq= false;
	        		break;
	        	}
	        }
	    }
             if(eq==false)
	    {
	    	System.out.println("Matrix(A)& Matrix(B) are NOT Equal ! "); 
	    }
	    else 
	    {
	    	System.out.println("Matrix(A)& Matrix(B)  are Equal ! ");
	    }
	}
	else
        {
            System.out.println("The size of two Matrix A & B are NOT Equal ! then the Matrix A & B Are NOT Equal ! ");
        
        }
        
        
       
    }
    
    public void ZeroMatrix()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Zero Matrix  :-  ");
        System.out.println("Rows: ");
        rows=sc.nextInt();
        System.out.println("columns: ");
        columns=sc.nextInt();
        matrix1= new float[rows][columns];
        
          
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix1[i][j] = 0;
            }
        }  
        
        System.out.println("The Zero Matrix :-  ");
        
          for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }  
          
    }
   
    public void Insert_Default_Matrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the (Matrix-A) :-  ");
        System.out.println("Rows: ");
        rows=sc.nextInt();
        System.out.println("columns: ");
        columns=sc.nextInt();
        matrix1= new float[rows][columns];
        
        for(int i =0 ; i<rows;i++)
            for(int j=0;j<columns;j++)
            {
                matrix1[i][j]=0;
            }
    }
    
    public void Identity_Matrix()
    {
      
        
        for(int i =0 ; i<rows;i++)
        {
            for(int j=0; j<columns ; j++)
            {
                if(i==j)
                {
                    matrix1[i][j]=1;
                }
                else
                    matrix1[i][j]=0;
            }
        }
        
        //display
        System.out.println("The Identity Matrix :-");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                 System.out.print("\t" + matrix1[i][j]);
               
            }
            System.out.println();
        }  
        
    }
    
    public void Inverse_Matrix()
    {	
                float determinant=0;
                Scanner sc = new Scanner(System.in);
		if(rows==columns)
                {    
                 for(int i = 0; i < rows; i++)
                {
	        determinant = determinant + (matrix1[0][i] * ( matrix1[1][(i+1)%rows] * matrix1[2][(i+2)%rows] - matrix1[1][(i+2)%rows] * matrix1[2][(i+1)%rows]) );
		}
                 
                 
		System.out.println("\n Determinant |A| of Matrix-A- is  = " + determinant);
				
		System.out.println("\n Inverse of Matrix-A-  is:");
                
                
		for(int i = 0; i < rows; ++i) {
                    
			for(int j = 0; j < rows; ++j)
                        {
				System.out.print((((matrix1[(j+1)%rows][(i+1)%rows] * matrix1[(j+2)%rows][(i+2)%rows]) - (matrix1[(j+1)%rows][(i+2)%rows] * matrix1[(j+2)%rows][(i+1)%rows]))/ determinant) + "  ");
                        }
			System.out.print("\n");
		}
	}
                else 
                    System.out.println("ooops , The Inverse NOT valid , Matrix MUST be SQUARE Matrix !! ");
    }
 }
    
