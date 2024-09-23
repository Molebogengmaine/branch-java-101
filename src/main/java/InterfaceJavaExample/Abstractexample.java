package InterfaceJavaExample;

  abstract class Abstractexample implements  InterfaceExample2{

      //******Abstract class does not implement all the methods in the interface unlike concrete class
      // that implements everything******//
      public void myName() {
          System.out.println("Molebogeng");
      }
  }
