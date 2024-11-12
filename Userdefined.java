//S3 R2 59 Thejus

class PrimeException extends Exception
{
  private String message;
  public PrimeException(String message)
  {
    this.message=message;
  }
  public String getMessage()
  {
    return message;
  }
}
class Userdefined
{
  public static void main(String args[])
  {
    try{
       int n=15,flag=0;
       for(int i=2;i<=n/2;i++)
       {
         if(n%i==0)
         {
           flag=1;
           break;
         }
       }
       if(flag==1){
        throw new PrimeException(n+" is not prime");
       }
       System.out.println(n+" is prime");
     }
   catch(PrimeException e)
   {
     System.out.println(e.getMessage());
   }
  }
}
