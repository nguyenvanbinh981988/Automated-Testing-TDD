package absolute_number_calculator;

public class AbsoluteNumber {

    public static double absoluteNumberCalculator(double number){
        if (number<0){
            return number*(-1);
        } else {
            return number;
        }
    }
}
