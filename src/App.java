import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //0 + 1 = 1

        //1 + 1 = 2
       
        //1 + 2 = 3
       
        //2 + 3 = 5
       
        //3 + 5 = 8
       
        //5 + 8 = 13
       
        //13 + 8 = 21
       
        //21 + 13 = 34
        //Defining variables and creating instance of Scanner class
        double leftOfOp = 0, rightOfOp = 1, total = 0, numberOfSteps = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the step count of Fibonacci calculation: ");
        numberOfSteps = input.nextDouble();
        
        for(int i=0; i < numberOfSteps; i++)
        {
            total = leftOfOp + rightOfOp;//sum values to determine next element of fibonacci series
            leftOfOp = rightOfOp;//Found by manuel trial and error
            rightOfOp = total;//Found by manuel trial and error
            System.out.println(total);//total is the ith element of fibonacci series
        }
    }
}
