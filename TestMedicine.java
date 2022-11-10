import java.util.Random;

class Medicine
{
    String drug,companyName,address;
    void displayLabel(String drug,String companyName,String address)
    {
        System.out.println("Company name is " + companyName);
        System.out.println("Address is "+ address);
    }
}
class Tablet extends Medicine
{
    String type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("Store in a cool dry place.");
    }
}
class Syrup extends Medicine
{
    String type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("Consume 5ml 3 times a day.");
    }
}
class Ointment extends Medicine {
    String Type;

    @Override
    void displayLabel(String drug, String companyName, String address) {
        super.displayLabel(drug, companyName, address);
        System.out.println("For external use only.");
    }
}
class TestMedicine
{
    public static void main(String[] args) {
    
        double a=Math.random()*4;
        System.out.println(a);
        int b=(int)a;
        System.out.println(b);
      
        switch (b)
        {
            case 1:
                Medicine m1=new Medicine();
                Tablet t1=new Tablet();
                m1.displayLabel("Novamox","CIPLA LTD","Goa");
                t1.displayLabel("Novamox","CIPLA LTD","Goa");
                break;

            case 2:
                Medicine m2=new Medicine();
                Syrup s2=new Syrup();
                m2.displayLabel("Cough syrup","GlaxoSmithKline","Bangalore");
                s2.displayLabel("Cough syrup","GlaxoSmithKline","Bangalore");
                break;

            case 3:
                Medicine m3=new Medicine();
                Ointment o3=new Ointment();
                m3.displayLabel("Moov","Reckitt Benckiser","Solan");
                o3.displayLabel("Moov","Reckitt Benckiser","Solan");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}