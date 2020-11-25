/*Develop a Java program which has the (only) class CircleDemo that has members-
radius, area and perimeter. Include methods to do the following.

a. accept the radius from the user
b. find the area of the circle
c. find the perimeter of the circle
d. Display all the details
*/

import java.util.Scanner;
class CircleDemo{
  double radius;
  double area;
  double perimeter;

  void setdata(){
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    radius = ss.nextDouble();
  }

  double getarea(double r){
    return 3.14*r*r;
  }

  double getperimeter(double r){
    return (2*3.14*r);
  }

  void getdetails(double r, double a, double p){
    System.out.println("Radius: "+r);
    System.out.println("Area: "+a);
    System.out.println("Perimeter: "+p);
  }
}
class CircleDemo_main{
  public static void main(String args[]){
    CircleDemo c1 = new CircleDemo();
    c1.setdata();
    c1.area = c1.getarea(c1.radius);
    c1.perimeter = c1.getperimeter(c1.radius);
    c1.getdetails(c1.radius,c1.area,c1.perimeter);
}
}
