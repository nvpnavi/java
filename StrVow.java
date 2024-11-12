import java.util.Scanner;
class StrVow
{ public static void main(String args[])
	{ Scanner n=new Scanner(System.in);
	  System.out.println("Enter a String");
	  String s=n.nextLine();
	  int vowelc=0;
	  int consoc=0;
	  for(int i=0;i<s.length();i++)
	  { char x=s.charAt(i);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
		{ vowelc++;
	    }
		else if(x!= ' ')
		{ consoc++;
	    }
	  }
	  System.out.println("Number of Consonants: "+consoc);
	  System.out.println("Number of Vowels: "+vowelc);
	}
}
		
