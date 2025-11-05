
public class rectangle{
    private double length;
    private double width;
    public rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public boolean shape(){
        if(length == width){
            return true;
        } else{
            return false;
        }
    }
}
public static void main(String[] args){
    rectangle ri = new rectangle(7.8, 4.6);
    double area = ri.area();
    System.out.println(area);
}