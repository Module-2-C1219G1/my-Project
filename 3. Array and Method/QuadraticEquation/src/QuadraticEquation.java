        public class QuadraticEquation {
    private double a=0;
    private double b=0;
    private double c=0;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return  Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c));
    }
    public double getRootB(){
        return  (-this.b - Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/(2*this.a);
    }
    public double getRootA(){
        return  (-this.b + Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/(2*this.a);
    }

    @Override
    public String toString() {
        if (getDiscriminant()>=0){
            return "The equation has two roots: "+getRootA()+"and "+getRootB();
        }else if (getDiscriminant() == 0){
            return "The equation has one roots: "+getRootA();
        }
        return "The equation has no root";
    }
}
