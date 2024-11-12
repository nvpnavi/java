import java.util.Scanner;
class SortNames
{ public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	  String[] s=new String[5];
	  System.out.println("Enter 5 names");
	  for(int i=0;i<5;i++)
	  {
		  s[i]=sc.nextLine();
	  }
	  for(int i=0;i<s.length-1;i++)
	  { for(int j=0;j<s.length-1-i;j++)
		  { if((s[j].compareTo(s[j+1])>0))
			  { String temp=s[j];
		        s[j]=s[j+1];
				s[j+1]=temp;
			  }
		  }
	  }
	  System.out.println("The sorted names are:");
	  for(int i=0;i<s.length;i++)
	       	  System.out.println(s[i]);
	  
	}
}
