class age{
    void checkAge(int age) {
    
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");

        }
    }
}
 class exceptionHnadling{
    public static void main(String[] args){
        
        try{
            int a=10, b=0;
            int c= a/b;
            System.out.println("The value of c is: "+c);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        try{
            int num= Integer.parseInt("Welcome to java");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        age age= new age();
        age.checkAge(15);
        
    }
 }
