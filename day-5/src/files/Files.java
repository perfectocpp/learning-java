package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception exp){
            exp.printStackTrace();
        } finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}

