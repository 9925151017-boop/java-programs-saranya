  class mca1{
    int rollno;
    String name;
    void display(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

}
public class mm {
    public static void main(String[] args){
        mca s1 = new mca1();
        s1.rollNo = 101;
        s1.name = "hars";
        s1.display();
    }
}

    

