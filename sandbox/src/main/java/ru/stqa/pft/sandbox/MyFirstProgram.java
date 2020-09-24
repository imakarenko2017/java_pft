package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("Alexey");
    hello("user");
    hello("Inna");
    Square s = new Square(5);
    System.out.println("Square for length = " + s.l + "=" + s.area());

    Rectangle r =new Rectangle(4,6);

    System.out.println("square with sides " + r.a + " and "+ r.b + " = " + r.area());

    //calculation distance between 2 points
    Point p1 = new Point(-1,3);
    Point p2 = new Point(6,2);
    System.out.println("Distance between point p1(" + p1.x + "," + p1.y + ")"+ "and p2(" + p2.x + ","  +p2.y + "=" + distance(p1,p2));

  }

  public static void hello(String somebody) {
        System.out.println("Hello," + somebody);
  }


  public static double distance(Point p1, Point p2)  {
   double res = Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2));
   return res;
  }

}