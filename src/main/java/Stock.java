import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Stock {
    public static Map<String, Integer> RemainsShops(Map<String, Integer> RemainsShop) {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data.csv"), ',', '"', 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] nextLine = null;
        try {
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    String[] temp = nextLine[0].split("[,]");
                    RemainsShop.put(temp[0], Integer.valueOf(temp[1]));
                }
            }
        } catch (IOException e) {
        }
        return RemainsShop;
    }

    public static void WriteFile(Map<String, Integer> RemainsShop) {
        String csv = "data.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv));
            for (Map.Entry entry : RemainsShop.entrySet()) {
                String[] record = {entry.getKey() + "," + entry.getValue()};
                writer.writeNext(record);
            }
            writer.close();
        } catch (java.io.IOException e) {
        }
    }
}


