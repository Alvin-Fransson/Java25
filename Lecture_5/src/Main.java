//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        System.out.println("Addition: " + math.add(5, 10));
        System.out.println("Subtraktion: " + math.subtract(5, 10));
        System.out.println("Multiplikation: " + math.multiply(5, 10));
        System.out.println("Division: " + math.divide(5, 10));

        System.out.println("----------------");

        Person person = new Person();
        person.greet("Alvin");
        person.introduce("Alvin" , 18, "Gnarp");

        System.out.println("----------------");

        Circle area = new Circle();
        System.out.println("Arean är " + area.calculateArea(5));

        Circle circumference = new Circle();
        System.out.println("Omkretsen är " + circumference.calculateCircumference(5));

        System.out.println("----------------");

    TemperatureConverter Converter = new TemperatureConverter();
    double fahrenheit = Converter.toCelsius(70);
    double celsius = Converter.toFahrenheit(20);

        System.out.println("70 Fahrenheit är " + fahrenheit + " grader celsius");
        System.out.println("20 Celsius är " + celsius + " grader fahrenheit");

        System.out.println("-----------------");


    }
}