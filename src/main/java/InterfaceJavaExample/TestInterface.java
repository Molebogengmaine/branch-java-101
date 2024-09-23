package InterfaceJavaExample;

public class TestInterface implements InterfaceExample2 {


    String name;
    public static void main(String[] args) {
        String reference = "";
        TestInterface testInterface = new TestInterface();
        testInterface.myName();
        testInterface.myLastName(reference);
    }


    @Override
    public void myName() {
        System.out.println("Molebogeng");
    }

    @Override
    public String myLastName(String lastName) {
        lastName = "Maine";
        System.out.println(lastName);
        return lastName;
    }
}
