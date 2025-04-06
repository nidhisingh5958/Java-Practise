class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);   }
    }
public class customException {
    static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");   }  
    public static void main(String[] args) {
        try{  
      validate(12);  
      }catch(Exception m){
        System.out.println("Exception occured: "+m);}  
        System.out.println("welcome to exception handling...");    
    } 
}

