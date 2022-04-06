import java.util.Scanner;
public class Complex{
    private float real, imag;
    public Complex(float _real, float _imag){
        real = _real;
        imag = _imag;
    }
    public Complex(float _real){
        real = _real;
    }

    public void add(Complex complex){
        real += complex.real;
        imag += complex.imag;
    }
    public void sub(Complex complex){
        real -= complex.real;
        imag -= complex.imag;
    }
    public void show(){
        if(imag > 0)
            System.out.printf("%.1f+%.1fi", real, imag);
        else if(imag < 0)
            System.out.printf("%.1f%.1fi", real, imag);
        else
            System.out.printf("%.1f", real);
    }
    public static void main(String[] aegv){
        Scanner s = new Scanner(System.in);
        Complex c1 = new Complex(s.nextFloat(), s.nextFloat()), c2 = new Complex(s.nextFloat(), s.nextFloat());
        if(s.next().equals("a"))
            c1.add(c2);
        else
            c1.sub(c2);
        c1.show();
        s.close();
    }
}
