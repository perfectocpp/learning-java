package recursive;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(exec("123+4342"));
        System.out.println(fuct(5));
        System.out.println(digitCount("sal0m"));
    }

    static int fibo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    static long exec(String exp) {
        int index;
        if ((index = exp.indexOf("+")) != -1) {
            String part1 = exp.substring(0, index);
            String part2 = exp.substring(index + 1);
            return exec(part1) + exec(part2);
        } else {
            return Long.parseLong(exp);
        }
    }

    static int fuct(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fuct(n - 1);
    }

    static int digitCount(String line) {
        if (line.isEmpty()) return 0;
        if (Character.isDigit(line.charAt(0))) {
            return 1 + digitCount(line.substring(1));
        } else {
            return digitCount(line.substring(1));
        }
    }

}
