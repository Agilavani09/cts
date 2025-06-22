package data_structure;

public class ForecastCalculator {
	public static double forecastRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return forecastRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double forecastMemo(double currentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = forecastMemo(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static double forecastIterative(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
