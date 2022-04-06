import java.util.Scanner;
public class Date{
private int year, month, day;
    public Date(int _year, int _month, int _day){
        year = _year;
        month = _month;
        day = _day;
    }
    public int to192511(int year, int mon, int d){
        int day = 0, y = 1924;
        while(++y<year){
            if(((y%4==0) && y%100!=0)||(y%400==0))
                day+=366;
            else
                day+=365;
        }
        y=0;
        int m[]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(((year%4==0) && year%100!=0)||(year%400==0))
            m[2]=29;
        while(++y<mon)
            day+=m[y];
        day+=d;
        return day;
    }

int DiffDays(Date d){//计算两个日期之间的相距天数的成员方法
int year1 = d.year, mon1 = d.month, day1 = d.day;
        return (to192511(year1, mon1, day1) - to192511(year, month, day));
}

public static void main(String args[]){
int a,b,c;
Date d1,d2;
try{
Scanner sc = new Scanner(System.in);
String str1 = sc.next();
a=Integer.parseInt(str1);
str1 = sc.next();
b=Integer.parseInt(str1);
str1 = sc.next();
c=Integer.parseInt(str1);
d1=new Date(a,b,c);
String str2 = sc.next();
a=Integer.parseInt(str2);
str2 = sc.next();
b=Integer.parseInt(str2);
str2 = sc.next();
c=Integer.parseInt(str2);
d2=new Date(a,b,c);
System.out.println("Daynum:"+d1.DiffDays(d2));
}catch(Exception e){
System.out.println("error");
}
}
}

