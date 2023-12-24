package ru.stqa.dz2;

public class Triangle {
    public static void main(String[] args) {

    }

    double side1;
    double side2;
    double side3;

    public Triangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Длина стороны треугольника не может быть отрицательной");
        }
        else if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalArgumentException("Нарушается неравенство треугольника. Cумма двух любых сторон должна быть не меньше третьей стороны");
        }
        else {
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        }
    }


    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }


    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s*(s- this.side1)*(s- this.side2)*(s- this.side3));
    }

    public boolean sideComparison(Triangle another){
        if (this.side1 == another.side1 || this.side1 == another.side2 || this.side1 == another.side3) {

            if (this.side2 == another.side1 || this.side2 == another.side2 || this.side2 == another.side3){

                if (this.side3 == another.side1 || this.side3 == another.side2 || this.side3 == another.side3) {
                    return true;
                }

            }
        }
        return false;
    }
}
