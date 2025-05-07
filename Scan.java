package src.helper;

import java.util.Scanner;

public class Scan {
    private static final Scanner scannerStr = new Scanner(System.in);
    public static final Scanner scannerInt = new Scanner(System.in);


    public static int inT(String info, int min, int max) {

        int n1 = 0;
        try {
            System.out.print(info);
            n1 = scannerInt.nextInt();

            if (n1 >= min && n1 <= max) {
                return n1;
            }
            throw new IndexOutOfBoundsException("siz mani aytganimni qilmadiz ! ");
        } catch (IndexOutOfBoundsException h) {
            System.out.println("nega : " + h.getMessage());
            n1 = 0;
        } catch (Exception a) {
            System.out.println("hatolik berdi : " + a);
            scannerInt.next();
        }

        return n1 + inT(info, min, max);

    }


    public static int inT(String info) {

        int n1 = 0;
        try {
            System.out.print(info);
            n1 = scannerInt.nextInt();
            return n1;
        } catch (Exception a) {
            System.out.println("hatolik berdi : " + a);
            scannerInt.next();
        }

        return n1 + inT(info);

    }

    public static int inT() {

        int n1 = 0;
        try {

            n1 = scannerInt.nextInt();
            return n1;
        } catch (Exception a) {
            System.out.println("hatolik berdi : " + a);
            scannerInt.next();
        }

        return n1 + inT();

    }


    public static String str() {


        String s1 = scannerStr.nextLine();
        if (!s1.isBlank()) {
            return s1;
        }

        System.out.println("bosh malumot mumkin emas ! ");
        s1 = "";
        return s1 + str();

    }


    public static String str(String info) {

        System.out.print(info);
        String s1 = scannerStr.nextLine();
        if (!s1.isBlank()) {
            return s1;
        }

        System.out.println("bosh malumot mumkin emas ! ");
        s1 = "";
        return s1 + str(info);

    }

}
