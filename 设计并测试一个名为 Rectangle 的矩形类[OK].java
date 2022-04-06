import java.util.*;
import java.lang.Math;
public class Rectangle{
    private float x1, y1, x2, y2;
    public Rectangle(float _x1, float _y1, float _x2, float _y2){
        x1 = _x1;
        y1 = _y1;
        x2 = _x2;
        y2 = _y2;
    }
    public void Area(){
        System.out.printf("%.2f", Math.abs(x1-x2)*Math.abs(y1-y2));
    }
    public static void main(String[] argv){
        Scanner s = new Scanner(System.in);
        Rectangle r = new Rectangle(s.nextFloat(), s.nextFloat(), s.nextFloat(), s.nextFloat());
        r.Area();
        s.close();
    }
}
