package sample;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class DataBase {
    private static final String path = "TXT.txt";
    public static void load() {
        try {
            FileReader fileReader = new FileReader(path);
            int size = 16384;
            char[] buf = new char[size];
            int c;
            c = fileReader.read(buf);
            if(c != -1) {
                if (c < 16384) {
                    buf = Arrays.copyOf(buf, c);
                }
                String sBuf = new String(buf);
                do {
                    String path = sBuf.substring(sBuf.indexOf('\r') + 2, sBuf.indexOf(' '));
                    sBuf = sBuf.substring(sBuf.indexOf(' '), sBuf.length());
                    String name = sBuf.substring(sBuf.indexOf(' ') + 1, sBuf.indexOf('\r'));
                    sBuf = sBuf.substring(sBuf.indexOf('\r'), sBuf.length() - 1);
                    if (!AllMovies.isCreated()) {
                        new AllMovies(path, name);
                    } else {
                        AllMovies.add(path, name);
                    }
                } while (sBuf.length() != 0);
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void save() {
        try {
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.println("//AllMovies");
            String data;
            for(int i = 0; i < AllMovies.size(); i++) {
                data = AllMovies.getFilmData(i);
                writer.println(data);
            }
            writer.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
