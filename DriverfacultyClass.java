import java.util.Scanner;

class Faculty{
    int facultyId;
    float salary;
    void show()
    {
        System.out.println("Faculty id is: "+facultyId);
        System.out.println("Salary of faculty is: "+salary);
    }
}
class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the facultyId: ");
        facultyId= sc.nextInt();

        System.out.println("Enter the allowance: ");
        allowance= sc.nextFloat();

        System.out.println("Enter the basic wage: ");
        basic=sc.nextFloat();
        salary=basic+allowance;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Allowance of faculty is: "+allowance);
        System.out.println("Basic wage of faculty is: "+basic);
    }
}
class PartTimeFaculty extends Faculty
{
    float hour;
    float rate;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(Enter the facultyId: ");
        facultyId= sc.nextInt();
        System.out.println("Enter the working hours: ");
        hour= sc.nextFloat();
        System.out.println("Enter the rate for an hour: ");
        rate= sc.nextFloat();
        salary=hour*rate;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Hours working by faculty is: "+hour);
        System.out.println("Rate for an hour is:"+rate);
    }
}
public class DriverfacultyClass {
    public static void main(String[] args) {
        FullTimeFaculty f1=new FullTimeFaculty();
        FullTimeFaculty f2=new FullTimeFaculty();
        PartTimeFaculty p1=new PartTimeFaculty();
        PartTimeFaculty p2=new PartTimeFaculty();
        f1.input();
        f1.show();
        f2.input();
        f2.show();
        p1.input();
        p1.show();
        p2.input();
        p2.show();
    }
}