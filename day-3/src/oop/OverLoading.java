package oop;
class MyMath {
    // method Overloading
    int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    int max(int num1, int num2, int num3) {
        return this.max(num1, this.max(num2, num3));
    }
}
public class OverLoading  {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println(math.max(12, 23));
        System.out.println(math.max(12, 23, 34));

    }
}
