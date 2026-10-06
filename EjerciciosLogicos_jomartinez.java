package com.example;

public class EjerciciosLogicos_jomartinez {
    public static void main(String[] args) {
        System.out.println("\nEjercicios de logicos:");
        System.out.println("-------------------");
        System.out.println();
        System.out.println("1. 5 > 3 && 10 < 20: " + (5 > 3 && 10 < 20));
        System.out.println("2. 7 === \"7\" || 4 <= 2: " + (7 == 7 || 4 <= 2));
        System.out.println("3. !(6 === 6): " + !(6 == 6));
        System.out.println("4. (8 !== 8) || (9 >= 9): " + (8 != 8 || 9 >= 9));
        System.out.println("5. (3 < 2) && (2 > 1): " + (3 < 2 && 2 > 1));
        System.out.println("6. (\"JS\" === \"js\") || (\"Node\" === \"Node\"): " + ("JS".equals("js") || "Node".equals("Node")));
        System.out.println("7. (10 % 2 === 0) && (15 % 2 === 1): " + (10 % 2 == 0 && 15 % 2 == 1));
        System.out.println("8. !(true && false): " + !(true && false));
        System.out.println("9. (\"5\" == 5) && (\"5\" === 5): " + (Integer.parseInt("5") == 5 && Integer.parseInt("5") == 5));
        System.out.println("10. (2 * 2 === 4) || (3 + 2 === 10): " + (2 * 2 == 4 || 3 + 2 == 10));
        System.out.println("11. (\"hola\".length === 4) && (\"adios\".length > 3): " + ("hola".length() == 4 && "adios".length() > 3));
        System.out.println("12. false || (true && true): " + (false || (true && true)));
        System.out.println("13. !(false) && (2 ** 3 === 8): " + (!(false) && Math.pow(2, 3) == 8));
        System.out.println("14. (100 / 10 === 10) || (50 / 5 === 20): " + (100 / 10 == 10 || 50 / 5 == 20));
        System.out.println("15. (\"A\" < \"B\") && (\"a\" > \"Z\"): " + ("A".compareTo("B") < 0 && "a".compareTo("Z") > 0));
        System.out.println("16. (5 >= 5) && (10 < 5): " + (5 >= 5 && 10 < 5));
        System.out.println("17. (3 !== 2) || (3 !== 3): " + (3 != 2 || 3 != 3));
        System.out.println("18. !(7 > 3 && 2 < 5): " + !(7 > 3 && 2 < 5));
        System.out.println("19. (0 === false) || (\"\" === false): " + (0 == 0 || "".equals(false)));
        System.out.println("20. (1 + 2 * 3 === 7) && (4 * 2 === 8): " + (1 + 2 * 3 == 7 && 4 * 2 == 8) + "\n");
    }
}