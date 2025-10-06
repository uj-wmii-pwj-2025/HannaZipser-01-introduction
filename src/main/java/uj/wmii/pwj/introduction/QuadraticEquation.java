package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {
        if (a == 0){
            throw new IllegalArgumentException("a parameter can not be 0");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new double[0];
        }

        double sqrtDelta = Math.sqrt(delta);
        if (delta == 0){
            double root = -b / (2 * a);
            return new double[]{root};
        }

        double root1 = (-b - sqrtDelta) / (2 * a);
        double root2 = (-b + sqrtDelta) / (2 * a);
        return new double[]{root1, root2};
    }
}

