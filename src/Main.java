import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prosty kalkulator. Wpisz 'q' aby wyjść.");
        while (true) {
            System.out.print("Podaj pierwszą liczbę (lub 'q'): ");
            String s1 = sc.next();
            if (s1.equalsIgnoreCase("q")) break;
            double a;
            try {
                a = Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.");
                continue;
            }

            System.out.print("Podaj operator (+, -, *, /): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("q")) break;
            if (!op.matches("[+\\-*/]")) {
                System.out.println("Nieznany operator. Spróbuj ponownie.");
                continue;
            }

            System.out.print("Podaj drugą liczbę (lub 'q'): ");
            String s2 = sc.next();
            if (s2.equalsIgnoreCase("q")) break;
            double b;
            try {
                b = Double.parseDouble(s2);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.");
                continue;
            }

            switch (op) {
                case "+":
                    System.out.println("Wynik: " + (a + b));
                    break;
                case "-":
                    System.out.println("Wynik: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik: " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Błąd: dzielenie przez zero.");
                    } else {
                        System.out.println("Wynik: " + (a / b));
                    }
                    break;
            }
        }
        sc.close();
        System.out.println("Koniec programu.");
    }
}