//Practical 1 : Encapsulation Practical

//Area Class
public class Area {
    //Creating private instance variables
    private int length;
    private int breadth;

    //Creating getter & setter methods
    public void setLength(int l) {

        this.length = l;
    }
    public void setBreadth(int b)
    {
        this.breadth = b;

    }
    public int getLength()
    {
        return length;

    }
    public int getBreadth(){
        return breadth;
    }
}

//Main Class
class Main{
    public static void main(String []args){
        Area obj1 = new Area();

        //setting the values of instance variable
        obj1.setLength(46);
        obj1.setBreadth(10);

        //printing value of instance variable in console
        System.out.println("Length = "+obj1.getLength());
        System.out.println("Breadth = "+obj1.getBreadth());
    }
}
