import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import domain.*;

import util.CsvToBeans;

public class Main {
    static ArrayList<Route> routes = new ArrayList<Route>();

    public static void main(String[] args) throws IOException {
//        asynchronousRequest();

        List<RouteCsvToObject> beans = CsvToBeans.read("cities/lahti/routes.txt", RouteCsvToObject.class);

        List<Route> yeet = beans
            .stream()
            .map(RouteConverter::convert)
            .collect(Collectors.toList());

        yeet.forEach(x -> System.out.println(x.getRouteType().getDescription()));

    }

    private static void asynchronousRequest() throws IOException {
        String encoding = Base64.getEncoder().encodeToString((System.getenv("USER") + ":" + System.getenv("PASSWORD")).getBytes());
        new Vehicleposition(encoding);
        new Tripupdate(encoding);
    }
}
