
import java.util.Scanner; // imports Scanner

public class ShapeAreaCalculator { // class

    public static void main(String[] args) { // main method

        Scanner input = new Scanner(System.in); // creates Scanner object

        System.out.println("AREA CALCULATOR"); // displays title
        System.out.println("1. Triangle"); // displays option 1
        System.out.println("2. Square"); // displays option 2
        System.out.println("3. Rectangle"); // displays option 3
        System.out.println("4. Circle"); // displays option 4

        System.out.print("Select the shape: "); // asks for choice
        int choice = input.nextInt(); // reads choice

        double area; // stores the calculated area

        switch (choice) { // checks the selected shape

            case 1: // triangle
                System.out.print("Enter base: "); // asks for base
                double base = input.nextDouble(); // reads base

                System.out.print("Enter height: "); // asks for height
                double height = input.nextDouble(); // reads height

                area = 0.5 * base * height; // calculates triangle area
                System.out.println("Area of Triangle = " + area); // displays area
                break; // stops this case

            case 2: // square
                System.out.print("Enter side: "); // asks for side
                double side = input.nextDouble(); // reads side

                area = side * side; // calculates square area
                System.out.println("Area of Square = " + area); // displays area
                break; // stops this case

            case 3: // rectangle
                System.out.print("Enter length: "); // asks for length
                double length = input.nextDouble(); // reads length

                System.out.print("Enter width: "); // asks for width
                double width = input.nextDouble(); // reads width

                area = length * width; // calculates rectangle area
                System.out.println("Area of Rectangle = " + area); // displays area
                break; // stops this case

            case 4: // circle
                System.out.print("Enter radius: "); // asks for radius
                double radius = input.nextDouble(); // reads radius

                area = Math.PI * radius * radius; // calculates circle area
                System.out.println("Area of Circle = " + area); // displays area
                break; // stops this case

            default: // invalid choice
                System.out.println("Invalid choice!"); // displays error message
        }

        input.close(); // closes Scanner
    }
}

