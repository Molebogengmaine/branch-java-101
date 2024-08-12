package org.example.javaBasics.arrays;

public class ForeachLoop {

    public static void main(String[] args) {

        String [] names = {"lebo","maine","precious","Mo"};
     //for loop
        for (int i = 0; i< names.length; i ++){
            System.out.println("my name is " + names[i]);
        }
        //for each loop
        for (String name: names) {
            System.out.println(name);
        }

        StringBuilder []  builders = {new StringBuilder("for"),new StringBuilder("loop")};

        for (StringBuilder stringBuilder : builders){
            System.out.println(stringBuilder);
        }


        for (StringBuilder stringBuilder : builders){
            stringBuilder.append("123");
            System.out.println(stringBuilder);
        }

        String perts = "carrot";
        for (char c:perts.toCharArray()
             ) {
            System.out.println(c);
        }
    }
}
