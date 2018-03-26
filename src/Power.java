/**
 * Created by liyuanhua on 18/3/26.
 */
public class Power {

    public static double power(double base, int exponent) {

        double result = 1;
        if(base == 0)
            return 0;
        if(exponent == 0)
            return 1;

        for(int i=0;i<Math.abs(exponent);i++){
            if(exponent > 0)
                result *= base;
            if(exponent < 0)
                result /= base;

        }

        return result;

    }

    public static void main(String[] args){

        System.out.print(power(5, 3));
    }

}
