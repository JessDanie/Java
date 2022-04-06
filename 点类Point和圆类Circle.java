public class Circle{
/*******************************************************/
int r;
    Point center;
    public Circle(int _r, Point P){
        r = _r;
        center = new Point(P);
    }
/*******************************************************/

public void showInfo(){System.out.println("center=("+center.getx()+","+center.gety()+");r="+r+";");}

public static void main(String args[]){
Point p=new Point(10,20);
Circle c=new Circle(5,p);
p.showInfo();
c.showInfo();
}
}

class Point{
private int x,y;
/*******************************************************/
public Point(int _x, int _y){
        x = _x;
        y = _y;
    }
    public Point(Point P){
        x = P.x;
        y = P.y;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void showInfo(){
        System.out.printf("x=%d;y=%d;\n", x, y);
    }

/*******************************************************/
}

