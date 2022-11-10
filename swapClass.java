class  swap
{
       int x,y,temp;
    swap(int a,int b)
    {
        x=a;
        y=b;
    }
    void swapping(int x,int y)
    {
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping call by value method ");
        System.out.println("value of x is "+ x);
        System.out.println("value of y is " + y);
    }
    void swapping(swap s)
    {
        int k=s.x;
        s.x=s.y;
        s.y=k;
        System.out.println("After Swapping call by reference method ");
        System.out.println("value of x is " + s.x);
        System.out.println("value of y is " + s.y);
    }
}

public class swapClass {
    public static void main(String[] args) {
        swap c1=new swap(9,3);
        System.out.println("Before swapping value of x is: "+c1.x+" and value of y is : "+c1.y);
        c1.swap(9,3);
        System.out.println("\n");

        swap  c2=new swap(6,9);
        System.out.println("Before swapping value of x is: "+c2.x+" and value of y is : "+c2.y);
        c2.swap(c2);

    }


}