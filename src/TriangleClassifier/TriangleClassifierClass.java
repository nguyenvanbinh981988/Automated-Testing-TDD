package TriangleClassifier;

public class TriangleClassifierClass {
    public String creatTriangle(double a, double b, double c){
        boolean Triangle = a+b>=c && a+c>b && b+c > a;
        if (Triangle){
            if (a == b && b == c){
                return "this isn't a equilateral triangle";
            } else if (a == b || a == c || b == c){
                return "this isn't a isosceles triangle";
            } else {
                return "this isn't a normal triangle";
            }
        } else {
            return "this isn't a Triangle";
        }
    }
}
