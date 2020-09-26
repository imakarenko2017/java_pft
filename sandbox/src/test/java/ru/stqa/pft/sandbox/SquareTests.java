package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);



    }
  @Test
  public void testDistance1(){
    Point a = new Point(4,4);
    Point b = new Point(4,5);

    Assert.assertEquals(a.distance(b),1.0);


  }

  @Test
  public void testDistance2(){

    Point c = new Point(0,0);
    Point d = new Point(0,1);
    Assert.assertNotNull(c.distance(d));


  }

  @Test
  public void testDistance3(){

    Point c = new Point(-3,5);
    Point d = new Point(-3,-6);
    Assert.assertNotEquals(c.distance(d),11.5);


  }


}
