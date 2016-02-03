package week2;

// Complex3wDriver.java
// The Complex3 number class with a test/demo main() drriver included

public class Complex3wDriver {

    private double realPart = 0;
    private double imaginaryPart = 0;

    public Complex3wDriver(double a, double b) {
        realPart = a;
        imaginaryPart = b;
    }

    // accessor methods

    public void setRealPart(double value) {
        realPart = value;
    }

    public void setImaginaryPart(double value) {
        imaginaryPart = value;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // operators

    public void addComplex(Complex3wDriver c) {
        realPart = realPart + c.getRealPart();
        imaginaryPart = imaginaryPart + c.getImaginaryPart();
    }

    public void subtractComplex(Complex3wDriver c) {
        realPart = realPart - c.getRealPart();
        imaginaryPart = imaginaryPart - c.getImaginaryPart();
    }

    public static void main(String[] args) {  // a test driver and demo
        Complex3wDriver aComplex = new Complex3wDriver(1.0, 2.0);
        Complex3wDriver bComplex = new Complex3wDriver(3.0, 4.0);
        Complex3wDriver cComplex = new Complex3wDriver(aComplex.getRealPart() +
                bComplex.getRealPart(),
                aComplex.getImaginaryPart() +
                        bComplex.getImaginaryPart());
        Complex3wDriver dComplex = cComplex;

        System.out.println("\naComplex is: " + aComplex.getRealPart() + " + " +
                aComplex.getImaginaryPart() + "i");
        System.out.println("\nbComplex is: " + bComplex.getRealPart() + " + " +
                bComplex.getImaginaryPart() + "i");
        System.out.println("\naComplex is added to bComplex to give cComplex.");
        System.out.println("\ncComplex is: " + cComplex.getRealPart() + " + " +
                cComplex.getImaginaryPart() + "i");

        dComplex.setImaginaryPart(-1000.1);

        System.out.println("\ndComplex has its imaginaryPart set to -1000.1");
        System.out.println("\ndComplex is: " + dComplex.getRealPart() + " + " +
                dComplex.getImaginaryPart() + "i");
        System.out.println("\ncComplex is: " + cComplex.getRealPart() + " + " +
                cComplex.getImaginaryPart() + "i");
        System.out.println("\nNote that cComplex and dComplex reference the same object.");
    }  // main test driver and demo
}  // Complex3wDriver class

