import java.util.Scanner;
class MatrixMul
{
public static void main(String args[])
{
 int a[][]=new int[100][100];
 int b[][]=new int[100][100];
 int c[][]=new int[100][100];
 Scanner s=new Scanner(System.in);
 System.out.println("Enter no of rows and coloumns of first matrix:");
 int r1=s.nextInt();
 int c1=s.nextInt();
 System.out.println("Enter the elements for first matirx");
 for(int i=0;i<r1;i++)
 { for(int j=0;j<c1;j++)
	 { a[i][j]=s.nextInt();
     }
 }
 System.out.println("Enter the rows and coloumns of second matrix:");
 int r2=s.nextInt();
 int c2=s.nextInt();
 System.out.println("Enter the elements for the second matrix");
 for(int i=0;i<r2;i++)
 { for(int j=0;j<c2;j++)
	 { b[i][j]=s.nextInt();
     }
 }
 System.out.println("The First Matrix: ");
 for(int i=0;i<r1;i++)
 { for(int j=0;j<c1;j++)
	 { System.out.print(a[i][j]+"\t");
     }
	 System.out.println();
 }
 System.out.println("The Second Matrix:");
 for(int i=0;i<r2;i++)
 { for(int j=0;j<c2;j++)
	 { System.out.print(b[i][j]+"\t");
     }
	 System.out.println();
 }
 if(c1==r2)
 { for(int i=0;i<r1;i++)
	 { for(int j=0;j<c2;j++)
		 { for(int k=0;k<c1;k++)
			 { c[i][j]=c[i][j]+a[i][k]*b[k][j];
		     }
	     }
	 }
     System.out.println("The Product of the two matrics:");
     for(int i=0;i<r1;i++)
     { for(int j=0;j<c2;j++)
	     { System.out.print(c[i][j]+"\t");
         }
	     System.out.println();
     }
 }
 else
 { System.out.println("Matrix Multiplication not possible");
 }
}
}