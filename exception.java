import java.lang.String;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
class exception{
    private static final String OTHER_STATEMENT = "other statement";
    
    public static void validate(int a)throws InvalidAgeException{
        if (a<18){
            throw new InvalidAgeException("not valid");
        }
        else {
            System.out.println("valid for vote");
        }
    }
	public static void main(String args[]) throws InvalidAgeException {
        try{  
          try{  
           System.out.println("going to divide");  
           int b =39/0;  
          }catch(ArithmeticException e){System.out.println(e);}  
         
          try{  
            validate(17);
          int a[]=new int[5];  
          a[5]=4;  
          }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
           
          System.out.println(OTHER_STATEMENT);  
        }  
        finally{
        System.out.println("normal flow..");  
        }
       }  
} 