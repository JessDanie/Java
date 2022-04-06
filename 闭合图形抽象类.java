import java.util.Scanner;
abstract class ClosedFigure               //闭合图形抽象类
{
   protected String shape;
       public ClosedFigure(String _shape){
           shape = _shape;
       }
       public ClosedFigure(){
           ;
       }
       public abstract double perimeter();
       public abstract double area();

   public void print()                          //显示形状、属性、周长及面积
    {
        System.out.println("this is a "+this.shape+",perimeter:"+this.perimeter()+",area:"+this.area());
    }
}

 //定义椭圆类 
class Ellipse extends ClosedFigure{
    private int a, b;
    public Ellipse(int _a, int _b){
        a =_a;
        b =_b;
        shape = "Ellipse";
    }
    public double perimeter(){
        return Math.PI*(a+b);
    }
    public double area(){
        return Math.PI*a*b;
    }
}

 //定义矩形类
class Rectangle extends ClosedFigure{
    private int a, b;
    public Rectangle(int _a, int _b){
        a =_a;
        b =_b;
        shape = "Rectangle";
    }
    public double perimeter(){
        return a+a+b+b;
    }
    public double area(){
        return a*b;
    }
}

public class ClosedFigure_ex  
{
public static void main(String args[]){
int a,b;
ClosedFigure d1;
ClosedFigure d2;
try{
Scanner sc = new Scanner(System.in);
String str1 = sc.next();
a=Integer.parseInt(str1);
str1 = sc.next();
b=Integer.parseInt(str1);
d1=new Ellipse(a,b);
d1.print();

String str2 = sc.next();
a=Integer.parseInt(str2);
str2 = sc.next();
b=Integer.parseInt(str2);
d2=new Rectangle(a,b);
d2.print();
}catch(Exception e){
System.out.println("error");
}

}
}



