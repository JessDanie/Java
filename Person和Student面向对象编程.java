//请定义Person类
class Person{
  public String Name, Nationality;
  public int Age;
  public static int count = 1;
  public Person(String name, int age, String nationality){
    Name = new String(name);
    Nationality = new String(nationality);
    Age = age;
  }
  public void getName(){
    System.out.println("Name="+Name+";");
  }
  public void getAge(){
    System.out.println("Age="+Age+";");
  }
  public void getNationality(){
    System.out.println("Nationality="+Nationality+";");
  }
  public void growUp(){
     Age+=1;
  }
  public void show(){
    System.out.println("Person count:"+count+";");
    count++;
  }
}

//请定义Nationality接口
interface Nationality{
  
}

//定义一个Student类继承Person类，实现Nationality接口
class Student extends Person{
  public String Up;
  public Student(String name, int age, String nationality, String up){
    super(name, age, nationality);
    Up = up;
  }
  public Student(String name, String up){
    super(name, 0, "Undergraduate");
    Up = up;
    Nationality = "han";
  }
  public void growUp(){
    System.out.println(Up+";");
  }
  public void custom(){
    System.out.println("Spring Festival, Dragon Boat Festival, Mid-Autumn Festival");
  }
  public void policy(){
    if(Nationality.equals("han"))
      System.out.println("No preferential policies;");
    else if(Nationality.equals("man"))
      System.out.println("Have preferential policies;");
  }

//请参考main函数的内容编写以上内容
public static void main(String args[]){
Person a=new Person("zhangsan",19,"han");
a.getName();
a.getAge();
a.getNationality();
a.growUp();
a.getAge();
a.show();

Person b=new Person("lisi",39,"man");
b.getName();
b.getAge();
b.getNationality();
b.growUp();
b.getAge();
b.show();

Student c=new Student("wanger",33,"man","Postgraduate");
c.growUp();
c.custom();
c.policy();
c.show();

Student d=new Student("wanger","Undergraduate");
d.growUp();
d.custom();
d.policy();
d.show();
}
}



