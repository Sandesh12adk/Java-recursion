//Recrsive function to find if the string is palindrome or not
import java.util.*;
public class File4 {
    public static boolean ispalindrom(String str){
        if(str.length()<=1){
            return true;
        }
        char firstchar= str.charAt(0);
        char lastchar= str.charAt(str.length()- 1);
        if(firstchar!= lastchar){
            return false;
        }
        String newstr= str.substring(1,str.length()-1); // note 1 is inclusive and str.length() -1 is
                                                                                        // exclusive
         return ispalindrom(newstr);

    }
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= in.nextLine();
        in.close();
        boolean a= ispalindrom(str);
        if(a== true){
            System.out.println("This word is palindrome");
        }
        else
            System.out.println("This  word is not a palindrome");

    }
}
