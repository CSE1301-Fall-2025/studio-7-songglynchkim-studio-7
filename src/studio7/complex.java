public class twoComplex {
    public class twoComplex {
    private int real1;
    private int imag1;
    private int real2;
    private int imag2;
    public twoComplex(int real1, int imag1, int real2, int imag2){
        this.real1 = real1;
        this.imag1 = imag1;
        this.real2 = real2;
        this.imag2 = imag2;
    }
    public String addition(){
        return real1 + real2 + "+" + imag1 + imag2 + "i";
    }
    public String multiplication(){
        return (real1 * real2 - imag1 * imag2) + "+" + (real1 * imag2 + imag1 * real2) + "i";
    }
}

}
