package java11;

public class SwitchExaple {

    public static void main(String[] args) {

        String [] strs = {"A","B","CA","D"};
        int interation = 0;

        for (String s : strs){
            System.out.println("----------iteration"
            + (++interation) + ",s=" + s + "-----------");
            switch(s){

                case "A":
                    System.out.println("DO A");
                    break;
                default:
                    System.out.println("DOING THIS");

                case "B":
                    System.out.println("DO B");
                    break;
                case "C" + "A":
                    System.out.println("DO C");
                    break;
            }
        }

    }
}
