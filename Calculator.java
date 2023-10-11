import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> m = new HashMap<>();
        double total_score = 0;
        double total_points = 0;
        while (true) {
            System.out.println("Kurs: ");
            String course = sc.next();
            System.out.println("Antal poäng: ");
            double p = sc.nextDouble();
            System.out.println("Betyg:");
            double g = sc.nextDouble();
            double product = p * g;
            total_score += product;
            total_points += p;
            m.put(course, g);
            
            System.out.println("\nDitt genomsnittliga betyg: " + (total_score/total_points));
            for (String c : m.keySet()) {
                System.out.println(c + " " + m.get(c));
            }
        }
    }
}