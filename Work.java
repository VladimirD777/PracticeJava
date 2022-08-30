package test;

public class Work {
    public static void main(String[] args) {
        expressionOne(true, true);
        expressionTwo();
        expressionThree();
        expressionFour();
        expressionFive();
        expressionSix();
        expressionSeven();
        expressionEight();
    }

    public static void expressionOne(boolean q, boolean p) {

        System.out.println(!q & !p);
        System.out.println(!(q | p));

    }

    public static void expressionTwo() {
        boolean q = true;
        boolean p = false;
        System.out.println(!q & p);
        System.out.println(!(q | !p));

    }

    public static void expressionThree() {
        boolean q = false;
        boolean p = false;

        System.out.println(q & !p);
        System.out.println(!(!q | p));
    }

    public static void expressionFour() {
        boolean q = true;
        boolean p = true;
        System.out.println(q & p);
        System.out.println(!(!q | !p));
    }

    public static void expressionFive() {
        boolean q = false;
        boolean p = true;
        System.out.println(!q | !p);
        System.out.println(!(q & p));
    }

    public static void expressionSix() {
        boolean q = true;
        boolean p = false;
        System.out.println(!q | p);
        System.out.println(!(q & !p));
    }

    public static void expressionSeven() {
        boolean q = false;
        boolean p = false;
        System.out.println(q | !p);
        System.out.println(!(!q & p));
    }

    public static void expressionEight() {
        boolean q = true;
        boolean p = true;
        System.out.println(q | p);
        System.out.println(!(!q & !p));
    }
}
