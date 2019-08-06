public class Account {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Account(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public double getDiscriminant(){
        return b*2-4*a*c;

    }
    public double getRoot1(){
        double delta=getDiscriminant();

        return  (-b+Math.pow(delta,0.5))/(2*a);

    }
    public  double getRoot2(){
        double delta=getDiscriminant();
        return  (-b-Math.pow(delta,0.5))/(2*a);
    }
}
