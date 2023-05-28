package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide) {
            if (secondSide + thirdSide > firstSide) {
                if (firstSide + thirdSide > secondSide) {
                    System.out.println("this is a valid triangle");
                } else System.out.println("it's not a triangle");
            } else System.out.println("it's not a triangle");
        } else System.out.println("it's not a triangle");
    }

}
