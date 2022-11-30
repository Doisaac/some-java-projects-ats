
package ComplexNumbers;

/**
 *
 * @author MrDoisaac
 */
public class ComplexNumber {
    private double num1;
    private double imaginary;
    
    public ComplexNumber(double num1, double imaginary){
       this.num1 = num1;
       this.imaginary = imaginary;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public double getImaginary(){
        return imaginary;
    }
    
    public ComplexNumber calcSum(ComplexNumber c){
        ComplexNumber sum = new ComplexNumber((num1+c.getNum1()), (imaginary + c.getImaginary()));
        return sum;
    }
    
    public ComplexNumber calcMult(ComplexNumber c){
        ComplexNumber mult = new ComplexNumber( ( (num1*c.getNum1()) - (imaginary*c.getImaginary()) ),( (num1*c.getNum1()) + (imaginary*c.getNum1()) )  );
        return mult;
    }
    
    public boolean calcSame (ComplexNumber c){
        boolean same = false;
        if(num1 == c.getNum1() && imaginary == c.getImaginary()){
            same = true;
        }
        return same;
    }
    
    public ComplexNumber multiplicationWithAnInteger(int c){
        ComplexNumber integerMult = new ComplexNumber((c * num1),(imaginary*c));
        return integerMult;
    }
}
