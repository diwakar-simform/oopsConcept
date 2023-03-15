//Practical 2 : Inheritance practical

//Parent Class
public class Student {
    //created protected member so it can only accessible with inherited classes
    protected String name;
    protected int rollno;
    protected void displayName(){
        System.out.println("Parent Class: Name = "+this.name);
    }
    protected void displayRollNo(){
        System.out.println("Parent Class: RollNo = "+this.rollno);
    }
}

//Child class
class Cse extends Student{
    String specialization;
    void displaySpecialization(){
        System.out.println("Child Class: Specialization = "+this.specialization);
    }
}

//Main Class
class Main2{
    public static void main(String []args){
        Cse myobj = new Cse();

        //calling parent class data member using child class objects
        myobj.name="Diwakar Kumar";
        myobj.rollno = 2001;
        myobj.specialization = "AI";//child class data member

        // calling parent class methods using child class objects
        myobj.displayName();
        myobj.displayRollNo();
        myobj.displaySpecialization(); //child class method
        }
}
