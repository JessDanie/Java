import java.util.Scanner;

class MyDate{
private int year, month, day;
    public MyDate(int _year, int _month, int _day){
        year = _year;
        month = _month;
        day = _day;
    }
    public MyDate(MyDate mydata){
        year = mydata.year;
        month = mydata.month;
        day = mydata.day;
    }
    public void show(){
        System.out.printf("%d %d %d\n", year, month, day);
    }
    public void set(int _year, int _month, int _day){
        year = _year;
        month = _month;
        day = _day;
    }
}
class Person{
    public String name;           
    public MyDate birthday;  
    public Person(String _name, MyDate mydata){
        name = new String(_name);
        birthday = new MyDate(mydata);
        System.out.printf("gouzao:");
        show();
    }
    public Person(Person person){
        name = new String(person.name);
        birthday = new MyDate(person.birthday);
        System.out.printf("gouzao:");
        person.show();
    }
    public void show(){
        System.out.printf(name + " ");
        birthday.show();
    }
} //类Person 

public class EX{
public static void main(String args[]){
        String name; 
		int y,m,d;
        Scanner sc = new Scanner(System.in);
        name= sc.next();
        y= sc.nextInt();
        m= sc.nextInt();
        d= sc.nextInt();
        MyDate t=new MyDate(y,m,d);
        Person p1=new Person(name,t); 
        Person p2=new Person(p1);
	    p2.birthday.set(1987,2,27); 
		p1.show();
		p2.show();     
	    p2.birthday = new MyDate(2020,1,2);
		p1.show();
		p2.show(); 
}
}


