import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherInformation {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        
       
        double[] totalTemperature = new double[NUMBER_OF_DAYS + 1];
        double[] totalHumidity = new double[NUMBER_OF_DAYS + 1];
        int[] recordCount = new int[NUMBER_OF_DAYS + 1];

        try {
            File file = new File("weather.txt");
            Scanner input = new Scanner(file);

         
            while (input.hasNext()) {
                int day = input.nextInt();
                int hour = input.nextInt();
                double temperature = input.nextDouble();
                double humidity = input.nextDouble();

              
                if (day >= 1 && day <= NUMBER_OF_DAYS) {
                    totalTemperature[day] += temperature;
                    totalHumidity[day] += humidity;
                    recordCount[day]++;
                }
            }
            input.close();

           
            System.out.printf("%-6s%-25s%-25s\n", "Day", "Average Temperature", "Average Humidity");
            for (int i = 1; i <= NUMBER_OF_DAYS; i++) {
                if (recordCount[i] > 0) {
                    double avgTemp = totalTemperature[i] / recordCount[i];
                    double avgHumid = totalHumidity[i] / recordCount[i];
                    System.out.printf("%-6d%-25.2f%-25.4f\n", i, avgTemp, avgHumid);
                } else {
                    System.out.printf("%-6d%-25s%-25s\n", i, "No Data", "No Data");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'weather.txt' was not found.");
        }
    }
}