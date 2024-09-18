package pkga;

public class TestClass extends SuperClass {
    public static void main(String[] args) {
 
       //** Insert code here **/

        new TestClass().printPublicData("Hello World");
        new TestClass().printPackageData("Hello World");
        new TestClass().printProtectedData("Hello World");
      //  new TestClass().printPrivateData("Hello World");
    }
}