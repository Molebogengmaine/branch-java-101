package StudyGuideExamples;

public class LocalClassRules {

    public void processData() {
        final int length = 5;
        int width = 10;//efectively final
        int height = 3;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
       // Lebo lebo = new Lebo();
}
}
