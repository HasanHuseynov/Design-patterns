package singleton.exampleThree;

public class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton(){

    }
    public static Singleton getObject(){
        return obj;
    }
    public void print(){
        System.out.println("Singleton");
    }


}
