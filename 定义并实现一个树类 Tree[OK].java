import java.util.*;
public class Tree{
    private int ages;
    public Tree(int _ages){
        ages = _ages;
    } 
    public void grow(int _years){
        ages+=_years;
    }
    public void Show(){
        System.out.printf("%d", ages);
    }
    public static void main(String[] argv){
        Scanner s = new Scanner(System.in);
        Tree t = new Tree(s.nextInt());
        t.grow(s.nextInt());
        t.Show();
        s.close();
    }
}
