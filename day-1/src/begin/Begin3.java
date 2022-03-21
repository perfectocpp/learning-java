package begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter a diameter of circle: ");
        Double d = Scan.nextDouble();
        Double S = Math.pow((d/2), 2)*Math.PI;
        Double L = 2*Math.PI*d/2;

        System.out.println("area of circle = "+S+";\nLine of circle = "+L);
    }
}
