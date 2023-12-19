package ru.stqa.dz2;

public class Triangle {
    public static void main(String[] args) {

    }

    double side1;
    double side2;
    double side3;

    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }


    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }


    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s*(s- this.side1)*(s- this.side2)*(s- this.side3));
    }
}
