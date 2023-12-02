public class StdDetail {
    String name;
    int rollno;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    StdDetail(String name, int rollno, int age){
     this.age=age;
     this.name=name;
     this.rollno=rollno;
    }
}
