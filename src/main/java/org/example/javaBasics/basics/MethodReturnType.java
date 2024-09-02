package org.example.javaBasics.basics;

public class MethodReturnType {

    public void jump(){}//returns void
    public void jump1(){return;}//return is redudant

    public String jump3(){return "";}//compliles
   // public String jump4(){}//wont compile cause we did not specify the return type

    String jump6(int q){
        if (q==5){
            return "";
        }
        return "345";

    }

    /************METHOD ARGUMENTS **********/

    int getZero(){//niladic
        return 0;
    }

    int increment (int number){//has one argument == monadic
        return  number ++;
    }

    int sum (int a,int b){//two arguments dyadic
        return  a+b;
    }
    /***parameters are seperated by comma not semi colon****/

    int testSum (int a,int b,int c,int d,int t){
        return  a+b - c + c + d + t;
    }


}
