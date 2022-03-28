package string;

import java.util.Locale;
import java.util.Scanner;

// immutable
// String Methods
// equals, equalsIgnoreCase, compareTo, compareToIgnoreCase, length
// toUpperCase, toLowerCase ...
public class StringMethods {
    public static void main(String[] args) {
        String word = "my name is Jasurbek, ";
        System.out.println("original: "+word);

        toUpper(word);
        trim(word);
        charAt(word);
        codePoint(word);
        toCharArray(word);
        searching(word);
        starstWith(word);
        endsWith(word);
        contains(word);
        substring(word);
        split(word);
        replace(word);
        replaceFirst(word);
    }

    static void toUpper(String word){
        word = word.toUpperCase();
        System.out.println("from toUpper: "+word);
    }

    // ikki chetdagi ortiqcha char larni olib tashlaysi
    static void trim(String word){
        word = word.trim();
        System.out.println("from trim: "+word);
    }

    static void charAt(String word){
        char sym = word.charAt(4);
        System.out.println("from charAt: "+sym);
    }
    static void codePoint(String word){

        System.out.println("from codePint: "+word.codePointAt(4));
    }

    static void toCharArray(String word){
        char[] chars = word.toCharArray();
        System.out.println("from toCharArray"+chars);
    }
    static void searching(String word){
        System.out.println("FROM SEARCHING:");
        System.out.println("\tfrom indexOf(str): "+word.indexOf("m"));
        System.out.println("\tfrom indexOf(int): "+word.indexOf(5));

        System.out.println("\tfrom indexOf(str): "+word.lastIndexOf("M"));
        System.out.println("\tfrom indexOf(int): "+word.lastIndexOf(6));
    }
    static void starstWith(String word){
        System.out.println("FROM STARTSWITH:");

        System.out.println("\tfrom startsWith(prf): "+word.startsWith("my"));
        System.out.println("\tfrom startsWith(prf, tfst): "+word.startsWith("is",3 ));

    }

    static void endsWith(String word){
        System.out.println("from endsWith: "+word.endsWith("."));
    }

    static void contains(String word){
        System.out.println("from contains: "+word.contains("name"));
    }

    static void substring(String word){
        // kesish
        System.out.println("FROM SUBSTRING:");

        System.out.println("\tfrom substring(bgn): "+word.substring(0, 3));
        System.out.println("\tfrom substring(bgn, end): "+word.substring(3, 7));

    }

    static void split(String word){
        System.out.println("FROM SPLIT:");

        String[] words = word.split(" ");
        for (String elm : words){
            System.out.println("\t "+elm);
        }
    }

    static void replace(String word){
        System.out.println("from replace: "+word.replace("name", "ism").replace("is", " "));
    }

    static void replaceFirst(String word){
        System.out.println("from replaceFirst: "+word.replaceFirst("my", "mening"));
    }
}
