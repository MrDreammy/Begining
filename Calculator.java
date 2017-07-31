import java.util.Scanner;

public class Calculator {

       public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        float first;
        float second;
        String operator;

        System.out.println ("Type first number, and press enter.");
        first = scanner.nextFloat();

        System.out.println ("Type sign (*; +; /; -.) of operation and press enter");
        operator = scanner.next();

        System.out.println ("Type second number, and press enter.");
        second = scanner.nextFloat();

        if (operator.equals("*")){
            System.out.println("= " + (first * second));
        }
        if (operator.equals("/")){
            System.out.println("= " + (first / second));
        }
        if (operator.equals("+")){
            System.out.println("= " + (first + second));
        }
        if (operator.equals("-")){
            System.out.println("= " + (first - second));
        }
    }
}

