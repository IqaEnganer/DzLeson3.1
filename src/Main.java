public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight =76;
        double height = 1.75;
        double bodyWeight = service.calculate(weight, height);
        System.out.println (bodyWeight);
    }
}
