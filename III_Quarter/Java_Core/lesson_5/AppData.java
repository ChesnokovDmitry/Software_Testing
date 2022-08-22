package lesson_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private final String[] header;
    private final int[][] data;
    private BufferedWriter writer;

    public AppData(String[] header, int[][] data) throws IOException {
        this.header = header;
        this.data = data;
        save(this);
    }

    public void addition(int[][] data) throws IOException {
        for (int[] datum : data) {
            for (int i : datum) {
                writer.write(i + ";");
            }
            writer.write("\n");
        }
    }

    public void save(AppData appData) throws IOException {
        writer = new BufferedWriter(new FileWriter("demo.csv"));

        for (String s : header)
            writer.write(s + ";");

        writer.write("\n");
        addition(data);
    }

    public BufferedWriter getWriter() {
        return writer;
    }
}
