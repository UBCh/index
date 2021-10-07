public class Main {
        public static void main(String[] args) {

        BmiServis run = new BmiServis();
        double iMT = run.calculate(0, 0.3);
           int weight1 = 0;
           double height1 = 0;
            System.out.println(" масса тела =" +  weight1 + "кг");
            System.out.println(" рост =" + height1 + "см");
        System.out.println(" индекс массы тела = " + iMT + " кг/ м.кв ");

            double iMT2 = run.calculate(1, 1);
            int weight2 = 1;
            double height2 = 1;
            System.out.println(" масса тела =" +  weight2 + "кг");
            System.out.println(" рост =" + height2 + "см");
            System.out.println(" индекс массы тела = " + iMT + " кг/ м.кв ");

            double iMT3 = run.calculate(500, 2.6);
            int weight3 = 500;
            double height3 = 260;
            System.out.println(" масса тела =" +  weight3 + "кг");
            System.out.println(" рост =" + height3 + "см");
            System.out.println(" индекс массы тела = " + iMT3 + " кг/ м.кв ");

        }
}
