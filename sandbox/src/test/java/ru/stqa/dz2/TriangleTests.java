package ru.stqa.dz2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
