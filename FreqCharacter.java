import java.io.*;
class FreqCharacter
{ public static void main(String args[])
	{ 
	  InputStreamReader isr=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(isr);
	  try
	  { System.out.println("Enter a String");
	    String s=br.readLine();
	    System.out.println("Enter a character");
	    char c=(char)br.read();
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    { if(c==s.charAt(i))
	      { count++;
	      }
	    }
	    System.out.println("Frequency: "+count);
	  }
	  catch(IOException e)
		{ System.out.println(e.getMessage());
		}
	}
}
  
