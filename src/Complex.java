class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Constructor receiving a complex number s string
     *
     * @param aStr "a+bi" formatted complex number
     */

    public Complex(String aStr) {
        // "1+2i"
        String[] split;
        if (aStr.lastIndexOf("+") > aStr.lastIndexOf("-")) {
            split = aStr.replace('+', 'P') .split("P");
        } else {
            split = aStr.split("-");
        }

        real = Double.parseDouble(split[0]);

        String split2 = "";
        for (int i = 0; i < split[1].length()-1; i++) {
            split2 += split[1].charAt(i);
        }
        imag = Double.parseDouble(split2);
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    double angle() {
        return Math.atan2(imag, real);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}