import java.lang.Number;

public class MinMaxCalculations {
    /**
     * Compute the minimum of an array of numbers.
     */
    public static Number min(Number... numbers) {
        // lets use compare because we smart
        Number min = Double.MAX_VALUE;
        for (Number num : numbers) {
            if (num.doubleValue() < min.doubleValue()) {
                min = num;
            }
        }

        return min;
    }
    
    /**
     * Compute the maximum of an array of numbers.
     */
    public static Number max(Number ... numbers) {
        // lets use compare because we smart
        Number max = Double.MIN_VALUE;
        for (Number num : numbers) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }

        return max;
    }
}