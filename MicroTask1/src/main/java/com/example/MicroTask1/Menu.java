package com.example.MicroTask1;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public static void mainMenu() {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> shapeDetails = new ArrayList<>();

        System.out.println("To calculate area of a square: Choose 1.");
        System.out.println("To calculate area of a rectangle: Choose 2.");
        System.out.println("To calculate area of a circle: Choose 3.");
        System.out.println("To calculate area of a right-angled triangle: Choose 4.");
        System.out.println("To check all shape details: Choose 5.");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the size of a square: ");
                double side = scan.nextDouble();
                double squareArea = Calculations.calculateSquareArea(side);
                String squareDetails = "You entered " + side + ", " + "the area is " + squareArea + " (" + side + " x " + side + ")";
                shapeDetails.add(squareDetails);
                System.out.println(squareDetails);
                break;
            case 2:
                System.out.println("Please enter both sides of a rectangle: ");
                double rectangleWidth = scan.nextDouble();
                double rectangleHeight = scan.nextDouble();
                double rectangleArea = Calculations.calculateRectangleArea(rectangleWidth, rectangleHeight);
                String rectangleDetails = "You entered " + rectangleWidth + " and " + rectangleHeight + ", " + "the area is " + rectangleArea + " (" + rectangleWidth + " x " + rectangleHeight + ")";
                shapeDetails.add(rectangleDetails);
                System.out.println(rectangleDetails);
                break;
            case 3:
                System.out.println("In order to count the area of a circle. Please enter a radius: ");
                double radius = scan.nextDouble();
                double area = Calculations.calculateCircleArea(radius);
                String circleDetails = "The area of the circle is: " + area;
                shapeDetails.add(circleDetails);
                System.out.println(circleDetails);
                break;
            case 4:
                System.out.println("Please enter height and width to calculate the area of a right-angled triangle: ");
                double triangleWidth = scan.nextDouble();
                double triangleHeight = scan.nextDouble();
                double triangleArea = Calculations.calculateTriangleArea(triangleWidth, triangleHeight);
                String triangleDetails = "The area of the right-angled triangle is: " + triangleArea;
                shapeDetails.add(triangleDetails);
                System.out.println(triangleDetails);
            case 5:
                for (String shape : shapeDetails) {
                    System.out.println(shape);
                }
                break;
            default:
                break;
        }
    }
}
