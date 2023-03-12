package Com.Day20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration2 {
    static void validLastName(String lName)
    {
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(lName);
        boolean r0 = match.matches();
        if (r0)
            System.out.println("valid last name:");
        else
            System.out.println("invalid last name:");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the last name:");
        String lName = scanner.next();
        validLastName(lName);

    }
}
