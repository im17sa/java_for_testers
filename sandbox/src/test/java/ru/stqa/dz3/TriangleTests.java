package ru.stqa.dz3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.dz2.Triangle;

public class TriangleTests {

    @Test
    void  CalculatingThePerimeter(){
        var s = new Triangle(7.0, 7.0, 7.0);
        double result = s.perimeter();
        Assertions.assertEquals(21, result);
    }

    @Test
    void  TheAreaOfTheTriangle(){
        var s = new Triangle(4.0, 3.0, 5.0);
        double result = s.area();
        Assertions.assertEquals(6, result);
    }
    @Test
    void  NegativeSideLength(){
        try {
            var s = new Triangle(-1.0, 7.0, 7.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {
        }
    }
    @Test
    void  theTriangleInequalityIsViolated(){
        try {
            var s = new Triangle(16.0, 7.0, 7.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {
        }
    }
    @Test
    void  sideComparison(){
        Triangle  t1 = new Triangle(1, 3, 4);
        Triangle  t2 = new Triangle(4, 1, 3);
        Assertions.assertEquals(t1, t2);
    }
}