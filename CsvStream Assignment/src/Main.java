import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        double averageAge = CSVStreamProcessor.calculateAverageAge("D:\\Notes\\ACTIVITIES\\Back-End Training\\AdvancedOOP\\AnimalHierarchy\\CsvStream Assignment\\src\\People.csv");
        System.out.println("Average Age = " + String.format("%.2f", averageAge));
    }
}