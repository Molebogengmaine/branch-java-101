package org.example.javaBasics.basics;

public class MethodDesign {


    public void jump(){}

    //void public  jump2()  //invalid does not compile

    protected void jump3(){
        return;//this is redundant
    }

    void jump4(){} //default

    public final void jump5(){}
    public  static final void jump6(){}
    public final static void jump7(){}
    final static public  void jump9(){}
   // String int public void jump11(){}//cannot return two different types

   // public String void jumo6();
    // cannot complile can only return one value from it
  public String jump13(){
        return "";
  }
  /*return type is needed */
 // public String jump44(){}

    String jump55(int a){
        if (a==5){
            return "";
        }
        return "abc";
    }

    int getInt(){
        return 9;
    }

    int getLong(){
        return (int)9L;//casting a long to INT
    }

    int expended(){
        return 10;
    }

    boolean isTrue(){
        return  5>9;
    }
/******
    boolean isTrue(){
        return  5==15;
    }
*****/
    /**************method name***************/

    public void lebo(){}

   //public void 4frgg(){} not compile

    public  void _Lebo(){}
    public void $lebo(){}

}
