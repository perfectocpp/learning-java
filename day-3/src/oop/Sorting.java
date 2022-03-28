package oop;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Contestant[] contestants = new Contestant[n];

        for (int i = 0; i < n; i++) {
            contestants[i] = new Contestant();
            contestants[i].name = sc.next();
            contestants[i].point = sc.nextInt();
            contestants[i].age = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (contestants[i].point < contestants[j].point){
                    Contestant temp = contestants[i];
                    contestants[i] = contestants[j];
                    contestants[j] = temp;
                }
            }
        }

        for (Contestant contestant : contestants){
            if (contestant.canBeFinalist(20, 35) && contestant.isPassed(800)){
                contestant.printDetails();
            }

        }
    }
}
