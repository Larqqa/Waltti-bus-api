import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import domain.RouteConverter;
import domain.Routes;

public class Main {
    static ArrayList<Routes> routes = new ArrayList<Routes>();

    public static void main(String[] args) throws IOException {
//        asynchronousRequest();

        String fileName = "cities/lahti/routes.txt";
        InputStream resource = Main.class.getClassLoader().getResourceAsStream(fileName);
        if (Objects.isNull(resource)) throw new IllegalStateException("Invalid input!");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(resource));

        try (CSVReader reader = new CSVReader(bReader)) {
            reader.readAll().forEach(RouteConverter::new);
        } catch (CsvException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void asynchronousRequest() throws IOException {
        String encoding = Base64.getEncoder().encodeToString((System.getenv("USER") + ":" + System.getenv("PASSWORD")).getBytes());
        new Vehicleposition(encoding);
        new Tripupdate(encoding);
    }
}
