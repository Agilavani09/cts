package data_structure;

public class AppForecastRun {
	public static void main(String[] args) {
        double currentValue = 10000;  
        double growthRate = 0.10;     
        int years = 5;

        System.out.println(" Recursive Forecast:");
        double recursive = ForecastCalculator.forecastRecursive(currentValue, growthRate, years);
        System.out.println("Future Value (Recursive): ₹" + recursive);

        System.out.println("\n Optimized Forecast (Memoization):");
        Double[] memo = new Double[years + 1];
        double memoized = ForecastCalculator.forecastMemo(currentValue, growthRate, years, memo);
        System.out.println("Future Value (Memoized): ₹" + memoized);

        System.out.println("\n Iterative Forecast:");
        double iterative = ForecastCalculator.forecastIterative(currentValue, growthRate, years);
        System.out.println("Future Value (Iterative): ₹" + iterative);
    }
}
