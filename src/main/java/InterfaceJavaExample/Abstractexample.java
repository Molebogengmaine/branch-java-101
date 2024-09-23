package InterfaceJavaExample;

abstract class Abstractexample implements InterfaceExample2 {
    public static void main(String[] args) {

    }
      //******Abstract class does not implement all the methods in the interface unlike concrete class
      // that implements everything******//
      public void myName() { //introduce public access modifier to avoid the method being weaker
          System.out.println("Molebogeng");
      }
  }
