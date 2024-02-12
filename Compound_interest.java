import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double compoundInterest = calculateCompoundInterest(principle, rate, time);
        double totalAmount = principle + compoundInterest;
        System.out.printf("%.2f", totalAmount);
    }
    private static double calculateCompoundInterest(double principle, double rate, double time) {
        double compoundInterest = principle * Math.pow((1 + rate / 100), time) - principle;
        return compoundInterest;
    }
}
