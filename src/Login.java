//Practical 3 : Abstraction practical

//interface User
interface User{
    public abstract void getUserName();
    public abstract void getUserId();
}

//Login class implements User interface
public class Login implements User{
    public void getUserName(){
        System.out.println("Name: Diwakar Kumar");
    }
    public void getUserId(){
        System.out.println("Id: 200303105745");
    }
}

//Main class
class Main3{
    public static void main(String []args){
        Login obj = new Login();
        obj.getUserId();
        obj.getUserName();
    }
}