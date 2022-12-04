package labb1;

public class Helpers {
    // Helper function to check if var is inside set bounds
    // TODO: Now it checks if it is between (0,1) and not [0, 1]. Shouldnt it be the
    // latter?
    public static int inBounds(double UpperLimit, double LowerLimit, double amount) {
        int result = 0;
        if (amount > UpperLimit) {
            return result + 1;
        } else if (amount < LowerLimit) {
            return result - 1;
        }
        return result;
    }// inBounds()
}
