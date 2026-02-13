import java.util.Scanner;

public class FinallyDemo {
    public static void main(String [] args){
        // TODO: Read a and b
        Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	try{
		System.out.println("Result: " + a/b);
	}
	catch(ArithmeticException e){
		System.out.println("Error: " + e.getMessage());

	}
	finally{
		System.out.println("Finally block executed");
	}
        // TODO: try block
        // Perform division
        // Print "Result: " + result
        
        // TODO: catch ArithmeticException e
        // Print "Error: " + e.getMessage()
        
        // TODO: finally block
        // Print "Finally block executed"
    }
}
