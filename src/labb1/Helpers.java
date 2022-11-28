package labb1;

public class Helpers {
    //Helper function to check if  var is inside set bounds
    public static int inBounds(double UpperLimit, double LowerLimit, double amount){
        int result = 0;
        if (amount > UpperLimit){
            return result + 1;
        }
        else if (amount < LowerLimit) {
            return result - 1;
        }
        return result;
    }//inBounds()
}
