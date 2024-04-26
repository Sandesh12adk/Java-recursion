// Program to find the sum of n natural numbers.
import java.util.Scanner;
class myclass{

    public int sum(int n){
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);
    }

}

public class file2 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= in.nextInt();
        in.close();
        myclass obj= new myclass();
        int result= obj.sum(n);
        System.out.printf("The sum of %d natural numbers is %d",n,result);

    }
}
