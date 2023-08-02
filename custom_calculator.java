package learning;

import java.util.Scanner;

class invalid_input_exception extends Exception {

    @Override
    public String toString() {
        return "INVALID INPUT ERROR.";
    }

    @Override
    public String getMessage() {
        return "INVALID INPUT ERROR.";
    }
}
class cannot_divide_by_zero extends Exception{

    @Override
    public String toString(){
        return "Cannot divide by zero.";
    }
    @Override
    public String getMessage(){
        return "Cannot divide by zero.";
    }
}
class maximum_input_reached extends Exception{

    @Override
    public String toString(){
        return "MAX INPUT LIMIT HAS BEEN CROSSED.";
    }
    @Override
    public String getMessage(){
        return "MAX INPUT LIMIT HAS BEEN CROSSED.";
    }
}


class calc{


    /**
     *<p>This method is used to add one number with the other,considering two limitations,
     *      first is that <b>it cannot take the first value as 8 and second as 9</b>,
     *      second is that <b>it cannot take an input greater than 100000</b>.</p>
     * @param a This is the first number.
     * @param b This is the second number.
     * @return This returns a sum of a and b as a float value.
     * @throws invalid_input_exception
     * @throws maximum_input_reached
     */
    public float addition(float a, float b) throws invalid_input_exception,maximum_input_reached{
        if(a == 8 || b == 9) {
            throw new invalid_input_exception();
        } else if (a>100000 || b>100000){
            throw new maximum_input_reached();
        }
        else{
            float c = a+b;
            return c;
        }
    }

    /**
     * <p>This method is used to subtract one number from the other,considering two limitations,
     *      first is that <b>it cannot take the first value as 8 and second as 9</b>,
     *      second is that <b>it cannot take an input greater than 100000</b>.</p>
     * @param a
     * @param b
     * @return
     * @throws invalid_input_exception
     * @throws maximum_input_reached
     */

    public float subtraction(float a, float b) throws invalid_input_exception,maximum_input_reached{
        if(a == 8 || b == 9){
            throw new invalid_input_exception();
        }
        else if (a>100000 || b>100000){
            throw new maximum_input_reached();
        }
         else{
            float c = a-b;
            return c;

        }
    }

    /**
     * <p>This method is used to divide one number by the other,considering three limitations,
     *      first is that <b>it cannot take the first value as 8 and second as 9</b>,
     *      second is that <b>it cannot take an input greater than 100000</b>
     *      and the third is that <b>it cannot take the divisor as 0.</b></p>
     * @param a
     * @param b
     * @return
     * @throws invalid_input_exception
     * @throws cannot_divide_by_zero
     * @throws maximum_input_reached
     */
    public float division(float a, float b) throws invalid_input_exception,cannot_divide_by_zero,maximum_input_reached{
        if(a == 8 || b == 9){
            throw new invalid_input_exception();
        }
        else if(b == 0){
            throw new cannot_divide_by_zero();
        }
        else if (a>100000 || b>100000){
            throw new maximum_input_reached();
        }
        else{
            float c = a/b;
            return c;

        }
    }

    /**
     * <p>This method is used to multiply one number with the other,considering two limitations,
     *      first is that <b>it cannot take the first value as 8 and second as 9</b>,
     *      second is that <b>it cannot take an input greater than 7000</b>.</p>
     * @param a
     * @param b
     * @return
     * @throws invalid_input_exception
     * @throws maximum_input_reached
     */
    public float multiplication(float a, float b) throws invalid_input_exception,maximum_input_reached{
        if(a == 8 || b == 9){
            throw new invalid_input_exception();
        }
        else if (a>7000 || b>7000){
            throw new maximum_input_reached();
        }
        else{
            float c = a*b;
            return c;
        }
    }

}

public class custom_calculator {
    /**
     * This method is useful for calculations.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // INPUT NUMBER 1
        System.out.println("ENTER THE NUMBER:");
        float num1 = sc.nextFloat();

        // OPERATION
        System.out.println("WHICH OPERATION WOULD YOU LIKE TO PERFORM:");
        String inpo = sc.next();

        // INPUT NUMBER 2
        System.out.println("ENTER THE NUMBER:");
        float num2 = sc.nextFloat();

        calc c = new calc();

        // CHOICE OF OPERARION TO BE PERFORMED
        switch (inpo) {
            case "+" -> {
                try {
                    System.out.println(c.addition(num1, num2));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case "-" -> {
                try {
                    System.out.println(c.subtraction(num1, num2));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case "X" -> {
                try {
                    System.out.println(c.multiplication(num1, num2));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            case "/" -> {
                try {
                    System.out.println(c.division(num1, num2));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

