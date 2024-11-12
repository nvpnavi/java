import java.util.Scanner;
class StrPalindrome
{ public static void main(String args[])
	{ Scanner n=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s=n.nextLine();
	  int i;
	  String rev="";
	  for(i=s.length()-1;i>=0;i--)
	  { rev=rev+s.charAt(i);
      }
      if(s.equals(rev))
	  { System.out.println("String is a palindrome");
      }
	  else
	  {	  System.out.println("String is not a palindrome");
	  }
    }	  
}