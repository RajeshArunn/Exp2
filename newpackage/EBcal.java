package newpackage;
import java.util.Scanner;
public class EBcal{
    public static void main(String[] args) {
        show obj=new show();
        obj.cal();  
    }  
}
class show
{
    void cal(){
        String name,type;
        double cnum,pread,cread;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name:");
        name=sc.next();
        System.out.println("Enter customer number:");
        cnum=sc.nextDouble();
        System.out.println("Enter previous month reading:");
        pread=sc.nextDouble();
        System.out.println("Enter current month reading:");
        cread=sc.nextDouble();
        System.out.println("Enter type of connection:");
        type=sc.next();
        System.out.println("1.Name:"+name+"\n2.No:"+cnum+"\n3.Previous:"+pread+"\n4.Current:"+cread+"\n5.Type of connection:"+type);
        if(type.toLowerCase().equals("domestic"))
        {
            bill obj1=new bill(cread,2,3.50,5,6);
        }
        else if(type.toLowerCase().equals("commercial"))
        {
            bill obj2=new bill(cread,3,5.50,7,8);
        }
    }
}
class bill
{
    bill(double x,double a, double b,double c,double d)
    {
        double tarif;
        if(x<=100)
        {
            tarif=x*a;
        }
        else if(x>100&&x<=200)
        {
            tarif=100*a+(x-100)*b;
        }
        else if(x>200&&x<=500)
        {
            tarif=100*a+100*b+(x-300)*c;
        }
        else
        {
            tarif=100*a+100*b+300*c+(x-500)*d;
        }
        System.out.println("Tarif:"+tarif);
    }
}
