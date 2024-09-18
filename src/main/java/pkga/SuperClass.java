package pkga;

//protected class SuperClass {// because you cannot use the access modifier 'protected' (or 'private') on an outer class.
  class SuperClass {

  //example 2  static void testMe() { System.out.println("SuperClass"); }
  //example 3
   /* String text="hello";
    SuperClass() {}
    protected SuperClass(String text) {}
    protected void setText(String text) { this.text = text; }
    public String toString() {  return text;  }*/

    //example 3
    public void printPublicData(String data) {
        System.out.println(data);
    }
    void printPackageData(String data) {
        System.out.println(data);
    }
    protected void printProtectedData(String data) {
        System.out.println(data);
    }
    private void printPrivateData(String data) {
        System.out.println(data);
    }


}
