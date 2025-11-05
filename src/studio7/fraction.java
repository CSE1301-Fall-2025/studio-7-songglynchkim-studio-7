public static void main(String[] args){
    fraction f1 = new fraction (7.7, 6.6);
    double result = f1.compute();
    System.out.println(result);
}
public class fraction {
    private double top;
    private double bottom;
    public fraction(double top, double bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public double compute(){
        return top / bottom;
    }
}
