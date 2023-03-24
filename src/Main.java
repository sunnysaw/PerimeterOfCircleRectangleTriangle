/*
Question : This is a Java Program to Find the Perimeter of a Circle, Rectangle and Triangle.
________________________________________________________________________________________________
formula:
Perimeter of circle=2*pi*r
Perimeter of rectangle=2*(l+b)
Perimeter of triangle=(s1+s2+s3)
________________________________________________________________________________________________________
Test case :
Enter radius of circle:4
Perimeter of circle:25.12

Enter length of rectangle:5
Enter breadth of rectangle:6
Perimeter of rectangle:22.0

Enter length of first side of triangle:3
Enter length of second side of triangle:4
Enter length of third side of triangle:5
Perimeter of triangle:12.0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14,radius,length,breadth,side1,side2,side3,circle,rectangle,triangle;
        System.out.println("Enter the radius of circle :");
        radius = sc.nextDouble();
        circle = 2 * pi * radius;
        System.out.println("Enter the length of rectangle  : ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = sc.nextDouble();
        rectangle = 2 * (length + breadth);
        System.out.println("Enter the length of first side of triangle :");
        side1 = sc.nextDouble();
        System.out.println("Enter the length of second side of triangle :");
        side2 = sc.nextDouble();
        System.out.println("Enter the length of third side of triangle :");
        side3 = sc.nextDouble();
        triangle = side1 + side2 + side3;
        System.out.println("Perimeter of circle : " + circle);
        System.out.println("Perimeter of rectangle : " + rectangle);
        System.out.println("Perimeter of triangle : " + triangle);

    }
}