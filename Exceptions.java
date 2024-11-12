class Exceptions
{ public static void main(String args[])
  { try
	  { int a=30,b=0;
	    int c=a/b;
		System.out.println("Answer="+c);
		System.out.println("Execution Ends Here");		
	  }
    catch(ArithmeticException m)
	{ System.out.println(m.getMessage());
	}
    finally
    { System.out.println("END");
    }
  }
}