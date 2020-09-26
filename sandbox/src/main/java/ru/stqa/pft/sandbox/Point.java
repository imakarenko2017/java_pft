package ru.stqa.pft.sandbox;

public class Point {
    public static void main(String[] args) {


    Point a = new Point(3, 7);
    Point b = new Point(4, 8);
      System.out.println(a.distance(b));


  }
  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

    public double distance(Point a){

       return  Math.sqrt(Math.pow((this.x-a.x),2) + Math.pow((this.y-a.y),2));

  }


}


