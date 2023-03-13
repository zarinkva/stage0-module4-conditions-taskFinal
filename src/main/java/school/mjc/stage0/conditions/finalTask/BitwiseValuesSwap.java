package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first+second);
    }

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseValuesSwapswap=new BitwiseValuesSwap();
        bitwiseValuesSwapswap.swap(10,11);
        bitwiseValuesSwapswap.swap(0,100);

    }
}
