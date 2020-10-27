package com.example.MicroTask1;

public interface Calculations {

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double rectangleWidth, double rectangleHeight) {
        return rectangleWidth * rectangleHeight;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double calculateTriangleArea(double triangleWidth, double triangleHeight) {
        return ((triangleWidth * triangleHeight) / 2);
    }
}
