package StrategyReport.Reports;

import StrategyReport.Interface.ReportGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVReport implements ReportGenerator {

    @Override
    public void generateReport(String fileName) {
        try (Stream<String> lineStream = Files.lines(Paths.get(fileName))) {

            System.out.println("\n--- Reading line by line with Stream ---");

            lineStream.forEach(line -> {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            });

        } catch (IOException e) {
            System.err.println("Error reading file with stream: " + e.getMessage());
        }
    }

}
