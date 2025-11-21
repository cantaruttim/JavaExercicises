package StrategyReport.Reports;

import StrategyReport.Interface.ReportGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;

public class JsonReport implements ReportGenerator {

    @Override
    public void generateReport(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(reader, JsonObject.class);

            System.out.println("Conteúdo do JSON:");
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}