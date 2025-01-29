import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        //To print String.
        String S1 = "Welcome to JAVa";
        //To print the LowerCase String.
        System.out.println(S1.toLowerCase());
        //To print the UpperCase String.
        System.out.println(S1.toUpperCase());
        //To erase the trailing and leading Spaces.
        S1 = "                      Welcome to    Java";
        System.out.println(S1.trim());
        //To replace a character.
        System.out.println(S1.replace('e','o'));
        //To replace only the first character.
        System.out.println(S1.replaceFirst("a","u"));
        //To replace a substring.
        System.out.println(S1.replaceAll("me t","o"));
        //To find index of the character inside the string.
        System.out.println(S1.indexOf('J'));
        //To find the last index of the character inside the string.
        System.out.println(S1.lastIndexOf('J'));
        //To concatenate two strings.
        System.out.println(S1.concat("Concatenater"));
        //To compare strings with ignoring lower or upper cases.
        System.out.println(S1.compareToIgnoreCase("String1S111"));
    }
}