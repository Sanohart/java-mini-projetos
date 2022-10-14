public class Main {
    public static void main(String[] args) {
        double teste1 = AreaCalculator.area(5.0);
        double teste2 = AreaCalculator.area(-1);
        double teste3 = AreaCalculator.area(5.0, 4.0);
        double teste4 = AreaCalculator.area(-1.0,4.0);

        System.out.println(teste1 + " " +
                teste2 + " " +
                teste3 + " " +
                teste4 + " ");
    }
}
