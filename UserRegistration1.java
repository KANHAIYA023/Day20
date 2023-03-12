package Com.Day20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration1 {
    static void validFirstName(String fName){

        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(fName);
        boolean r0 = match.matches();

        if (r0)
            System.out.println("valid first name: ");
        else
            System.out.println("invalid first name: ");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fName = scanner.next();
        validFirstName(fName);
    }
}
