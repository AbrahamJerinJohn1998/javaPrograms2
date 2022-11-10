public class InstancesinClass {
   static int c;
   static int id;
   public InstancesinClass()
   {
       c++;
   }

    public static void main(String[] args) {
        InstancesinClass a1=new InstancesinClass();
        InstancesinClass a2=new InstancesinClass();
        InstancesinClass a3=new InstancesinClass();
        a1=null;
        a2=null;
        Runtime.getRuntime().gc();
        System.out.println("Number of objects created = "+c);
        System.out.println("Number of objects destroyed = "+id);
        System.out.println("Number of objects alive = "+(c-id));
    }
    protected void finalize()
    {
        id++;
    }

}