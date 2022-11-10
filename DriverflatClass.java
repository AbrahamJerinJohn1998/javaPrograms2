class OneBHK
{
    float roomArea;
    float hallArea;
    float price;
    OneBHK()
    {
        System.out.println("default constructor");
    }
    OneBHK(float roomArea,float hallArea,float price)
    {
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;

    }
    void show(String a)
    {
        System.out.println(a);
        System.out.println("Area of room is"+roomArea);
        System.out.println("Area of hall is"+hallArea);
        System.out.println("Price is"+price);
    }
}
class TwoBHK extends OneBHK
{
    float room2Area;
    TwoBHK()
    {
        System.out.println("TwoBHK constructor");
    }
    TwoBHK(float roomArea,float hallArea,float price,float room2Area)
    {
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }

    @Override
    void show(String a) {
        super.show(a);
        System.out.println("Area of room2 is"+room2Area);
    }
}
public class DriverflatClass {
    public static void main(String[] args) {
        TwoBHK f1=new TwoBHK(5,4,3,5);
        TwoBHK f2=new TwoBHK(5,9,95,7);
        TwoBHK f3=new TwoBHK(25,37,45,53);
       
        f1.show("flat1");
        System.out.println("\n");

        f2.show("flat2");
        System.out.println("\n");

        f3.show("flat3");
        System.out.println("\n");

        System.out.println("Total Price is :"+(f1.price+f2.price+ f3.price));
    }
}