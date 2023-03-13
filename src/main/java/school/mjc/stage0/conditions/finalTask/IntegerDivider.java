package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = 0;
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        try {
            result = dividend / divider;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
            return;
        }
        if (result * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }

    }

    public static void main(String[] args) {
        IntegerDivider integerDivider=new IntegerDivider();
        integerDivider.printCompletelyDivided(100,200);
        integerDivider.printCompletelyDivided(0,99);
        integerDivider.printCompletelyDivided(-10,-25);
        integerDivider.printCompletelyDivided(24,0);
        }

    }

