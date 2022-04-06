public class Class{
private String num;
    private int count, in=0, sum = 0, max =0, maxscore = 0, min = 0, minscore = 100;
    private Student[] mate = null;
    public Class(String _num, int _count){
      num = new String(_num);
      count = _count;
      mate = new Student[count];
    }
    public void append(Student S){
      if(in < count){
        mate[in] = S;
        in++;
      }
    }

public void totalAndaverage(){ 
for(int i = 0; i< mate.length;i++){
        sum+=mate[i].score;
        if(mate[i].score>maxscore){
          max = i;
          maxscore = mate[i].score;
        }
        if(mate[i].score<minscore){
          min = i;
          minscore = mate[i].score;
        }
      }
System.out.println("total score:"+sum);  
System.out.println("average score:"+sum/count);
}

public void maxAndmin(){ 

System.out.println("max Info:"+mate[max].showInfo());
System.out.println("max Info:"+mate[min].showInfo());  
 }

public static void main(String args[]){
Class c=new Class("class1",3);
Student p=new Student("zhangsan","101",47);
c.append(p);
p=new Student("lisi","102",68);
c.append(p);
p=new Student("wanger","103",98);
c.append(p);
c.totalAndaverage();
c.maxAndmin();
}
}

class Student{
public String  name, num;
      public int score;
      public Student(String _name, String _num, int _score){
        name = new String(_name);
        num = new String(_num);
        score = _score;
      }
      public Student(){
        name = null;
        num = null;
        score = 0;
      }
      public String showInfo(){
        return "name="+name+";num="+num+";score="+score+";";
      }
}

