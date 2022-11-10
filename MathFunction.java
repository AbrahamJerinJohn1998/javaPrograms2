public class MathFunction {
    void multiply(int x,int y)
    {
        int m=x*y;
        System.out.println("Product of integers "+ x +" and  "+ y +" is= "+ m);
    }
    void multiply(float x,float y)
    {
        float m=x*y;
        System.out.println("Product of float values "+ x +" and  "+ y +" is= "+ m);

    }
    void multiply(float x,int y)
    {

        float m=x*y;
        System.out.println("Product of float value "+ x +" and integer "+ y +" is= "+ m);
    }

    public static void main(String[] args) {
        MathFunction f1=new MathFunction();
       f1.multiply(8,9);
       f1.multiply(2.9f,2.3f);
       f1.multiply(2.7f,7);
    }
}