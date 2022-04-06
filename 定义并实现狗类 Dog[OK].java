import java.util.Scanner;
public class Dog{
    private String petname, breed;
    private float age, weight;
    public Dog(){
        petname = "xiaoxiao";
        breed = "sheepdog";
        age = 2.0F;            weight = 10.0F;
    }
    public Dog(String _petname, String _breed, float _age, float _weight){
        if(_petname.equals("x")){
            petname = "xiaoxiao";
            breed = "sheepdog";
            age = 2.0F;
            weight = 10.0F;
        }
        else{
            petname = _petname;
            breed = _breed;
            age = _age;
            weight = _weight;
        }
    }
    public void Show(){
        System.out.printf(petname+" "+breed+" "+"%.1f %.1f\n",age, weight);
    }
    public static void main(String[] argv){
        Scanner s = new Scanner(System.in);
        String _petname = s.next(), _breed = s.next();
        float _age = s.nextFloat(), _weight = s.nextFloat();
        Dog myPet = new Dog(_petname, _breed, _age, _weight);
        myPet.Show();
        if(_petname.equals("x")){
            System.out.printf(_breed+" "+"%.1f %.1f\n",_age, _weight);
        }
        s.close();
    }
}
