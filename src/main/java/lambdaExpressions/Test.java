package lambdaExpressions;

/***
 * test example
 */
public class Test {

    interface  Changeable{
        void change(String s);
    }

    public static void main(String[] args) {
        Test t = new Test();
        Changeable c = (s) -> s = s + "World";
        String str = "Hello";
        t.changeIt(str,c);
        t.changeIt(str, (s) ->  s = s + "Hello");
        System.out.println(str);
    }

    public void changeIt(String s, Changeable c){
        c.change(s);
    }
}
