import java.util.Scanner;

public class shapecalculator {


    // --- SQUARE METHODS ---
    public static double getSquareArea(double side) {
        return side * side;
    }

    public static double getSquarePerimeter(double side) {
        return 4 * side;
    }

    // --- RECTANGLE METHODS ---
    public static double getRectangleArea(double length, double width) {
        return length * width;
    }

    public static double getRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // --- CIRCLE METHODS ---
    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getCirclePerimeter(double radius) { // Also known as circumference
        return 2 * Math.PI * radius;
    }

    // --- TRIANGLE METHODS ---
    public static double getTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Calculates area using Heron's Formula based on 3 sides
    public static double getTriangleArea(double side1, double side2, double side3) {
        double s = getTrianglePerimeter(side1, side2, side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        // Example test dimensions
        double squareSide = 5.0;
        double rectLength = 8.0, rectWidth = 4.0;
        double circleRadius = 3.5;
        double triSide1 = 3.0, triSide2 = 4.0, triSide3 = 5.0;

        System.out.println("=== SHAPE CALCULATIONS (USING METHODS) ===");

        // Square Outputs
        System.out.printf("\nSquare (Side: %.2f):\n", squareSide);
        System.out.printf("  Area: %.2f\n", getSquareArea(squareSide));
        System.out.printf("  Perimeter: %.2f\n", getSquarePerimeter(squareSide));

        // Rectangle Outputs
        System.out.printf("\nRectangle (Length: %.2f, Width: %.2f):\n", rectLength, rectWidth);
        System.out.printf("  Area: %.2f\n", getRectangleArea(rectLength, rectWidth));
        System.out.printf("  Perimeter: %.2f\n", getRectanglePerimeter(rectLength, rectWidth));

        // Circle Outputs
        System.out.printf("\nCircle (Radius: %.2f):\n", circleRadius);
        System.out.printf("  Area: %.2f\n", getCircleArea(circleRadius));
        System.out.printf("  Perimeter (Circumference): %.2f\n", getCirclePerimeter(circleRadius));

        // Triangle Outputs
        System.out.printf("\nTriangle (Sides: %.2f, %.2f, %.2f):\n", triSide1, triSide2, triSide3);
        System.out.printf("  Area: %.2f\n", getTriangleArea(triSide1, triSide2, triSide3));
        System.out.printf("  Perimeter: %.2f\n", getTrianglePerimeter(triSide1, triSide2, triSide3));
    }
}