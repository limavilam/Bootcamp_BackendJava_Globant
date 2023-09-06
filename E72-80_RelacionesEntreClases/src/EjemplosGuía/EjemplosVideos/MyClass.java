package EjemplosGuía.EjemplosVideos;

public class MyClass {
    public static void main(String args[]) {

        MyClass a = new MyClass();
        a.met (5,2);
    }
    private void met(int a, int b){
        b *= a;
        a += b;
        System.out.println(a);
    }
}
