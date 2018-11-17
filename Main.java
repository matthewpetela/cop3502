/*
Matthew E Petela
UFID: 8321-1202
Section Number: 6909
9/6/17

*/
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {

        //Declaring variables
        int length, width = 0;
        int radius = 0;
        int sideA, sideB, sideC = 0;
        int triBase, triHeight = 0;
        int pRectangle,pTriangle = 0;
        int areaRect = 0;
        double circumCircle, areaCircle, areaTri, heronS = 0;

        //New scanner
        Scanner scanner = new Scanner(System.in);

        //Requesting the information from user
        System.out.print("Enter the length of the Rectangle: ");
        length = scanner.nextInt();

        System.out.print("Enter the width of the Rectangle: ");
        width = scanner.nextInt();

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextInt();

        /*
        System.out.print("Enter the base of the Triangle: ");
        triBase = scanner.nextInt();

        System.out.print("Enter the height of the Triangle: ");
        triHeight = scanner.nextInt();
        */

        System.out.print("Enter side A of the Triangle: ");
        sideA = scanner.nextInt();

        System.out.print("Enter side B of the Triangle: ");
        sideB = scanner.nextInt();

        System.out.print("Enter side C of the Triangle: ");
        sideC = scanner.nextInt();

        //formulas for calculation

        pRectangle = 2 * (1+width);
        pTriangle = sideA + sideB + sideC;
        areaRect = width * length;
        circumCircle = 2 * Math.PI * radius;
        areaCircle = Math.PI * radius * radius;
        heronS = (sideA + sideB + sideC)/2.0;
        areaTri = Math.sqrt(heronS * (heronS - sideA) * (heronS - sideB) * (heronS - sideC));


        //print the information
        System.out.print("\nArea of Rectangle: " + areaRect);
        System.out.print("\nArea of Circle: " + areaCircle);
        System.out.print("\nPerimeter of rectangle: " + pRectangle);
        System.out.print("\nCircumference of circle: " + circumCircle);
        System.out.print("\nArea of Triangle: "+ areaTri);
        System.out.print("\nPerimeter of Triangle: " + pTriangle);


        //Part 2
        //declaring variables
        int radiusSphere, diameterRectPrism, heightRectPrism, widthRectPrism = 0;
        int heightCyl, radiusCyl = 0;

        double surAreaSphere, volSphere, surAreaRectPrism = 0;
        double volRectPrism, surAreaCyl, volCyl = 0;

        //Requesting information
        System.out.print("\nEnter the radius of the Sphere: ");
        radiusSphere = scanner.nextInt();

        System.out.print("Enter the diameter of the rectangular prism: ");
        diameterRectPrism = scanner.nextInt();

        System.out.print("Enter the height of the rectangular prism: ");
        heightRectPrism = scanner.nextInt();

        System.out.print("Enter the width of the rectangular prism: ");
        widthRectPrism = scanner.nextInt();

        System.out.print("Enter the height of the cylinder: ");
        heightCyl = scanner.nextInt();

        System.out.print("Enter the radius of the cylinder: ");
        radiusCyl = scanner.nextInt();


        //formulas
        surAreaSphere = 4 * Math.PI * radiusSphere * radiusSphere;
        volSphere = 4 * Math.PI * ((Math.pow(radiusSphere, 3))/3);
        surAreaRectPrism = 2 * ((heightRectPrism * diameterRectPrism) + (heightRectPrism * widthRectPrism) + (diameterRectPrism *widthRectPrism));
        volRectPrism = heightRectPrism * diameterRectPrism * widthRectPrism;
        surAreaCyl = (2 * Math.PI * radiusCyl * heightCyl) + (2 * Math.PI * radiusCyl * radiusCyl);
        volCyl = Math.PI * radiusCyl * radiusCyl * heightCyl;

        //print results
        System.out.print("\nThe surface area of the sphere is:  " + surAreaSphere);
        System.out.print("\nThe volume of the sphere is: " + volSphere);
        System.out.print("\nThe surface area of the rectangular prism is: " + surAreaRectPrism);
        System.out.print("\nThe volume of the rectangular prism is: " + volRectPrism);
        System.out.print("\nThe surface area of the cylinder is: " + surAreaCyl);
        System.out.print("\nThe volume of the cylinder is: " + volCyl);
    }
}