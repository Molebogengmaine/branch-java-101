package java11;

public class StringHackerRank {

    public static void main(String[] args) {

        String firstInput = "molebogeng";
        String secondinput = "precious";

        String[] testInput = firstInput.split("\\s");
        String[] testInput2 = secondinput.split("\\s");

        StringBuilder results = new StringBuilder();
        StringBuilder results2 = new StringBuilder();

        for (var word : testInput) {
            for (var word2 : testInput2) {

                results2.append(Character.toTitleCase(word2.charAt(0)))
                        .append(word2.substring(1))
                        .append(" ");
                results.append(Character.toTitleCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        System.out.println(firstInput.length());
        System.out.println(results.toString().trim().concat(" "+ results2.toString().trim()));
        var lexographicallyTest = firstInput.compareToIgnoreCase(secondinput);
        if (lexographicallyTest > 0)
        {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
