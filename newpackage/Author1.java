package newpackage;
import java.util.Scanner;
class Author1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        String x,y,s;
        char z;
        Author[] obj=new Author[100];
        System.out.println("Enter the number of persons:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name:");
            x=sc.next();
            System.out.println("Enter email:");
            y=sc.next();
            System.out.println("Enter gender:");
            z=sc.next().charAt(0);
            obj[i]=new Author(x,y,z);
        }
        
        for(i=0;i<n;i++)
        {
            System.out.println(obj[i].getname());
            System.out.println(obj[i].getemail());
            System.out.println(obj[i].getgender());
        }
        System.out.println("Enter the name of the person to change email:");
        s=sc.next();
        for(i=0;i<n;i++)
        {
            if(obj[i].name.equals(s))
            {
                 obj[i].setemail();
                 System.out.println(obj[i].toString());
            }
        }
        
    }
   
}
class Author
{
    Scanner sc=new Scanner(System.in);
    String name,email,em;
    char gender;
    Author(String a,String b,char c)
    {
        name=a;email=b;gender=c;
    }
    String getname()
    {
       return "Name:"+name;
    }
    String getemail()
    {
       return "Email:"+email;
    }
    String getgender()
    {
       return "Gender:"+gender;
    }
    String setemail()
    {
       System.out.println("Enter new email:");
       em=sc.next();
       email=em;
       return "New email:"+email;
    }
    @Override
    public String toString()
    {
        return "Name:"+name+"Email:"+email+"Gender:"+gender;
    }
   
}
