public class BmiServis {
    public double calculate(int weight, double height) {

        double fraction = Math.pow(height, 2);
        double indexW = weight / fraction;
        return indexW;
    }
    }
