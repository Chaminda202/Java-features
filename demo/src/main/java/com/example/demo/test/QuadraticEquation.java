package com.example.demo.test;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double val = b*b - 4*a*c;
        double root1 = 0, root2 = 0;
        if(val == 0){
            root1=root2=-b/2*a;
            //return new Roots(root1, root2);
        }else if(val > 0){
            root1= (-b - Math.sqrt(val))/ (2*a);
            root2= (-b + Math.sqrt(val))/(2*a);
            //return new Roots(root1, root2);
        }else{
            root1= (-b - Math.sqrt(-val))/(2*a);
            root2= (-b + Math.sqrt(-val))/(2*a);
        }
        
        return new Roots(root1, root2);
    }
    
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}