import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import domain.agency.Agency;
import domain.agency.AgencyConverter;
import domain.agency.AgencyCsvToObject;
import domain.calendar.Calendar;
import domain.calendar.CalendarConverter;
import domain.calendar.CalendarCsvToObject;
import domain.calendarDates.CalendarDates;
import domain.calendarDates.CalendarDatesConverter;
import domain.calendarDates.CalendarDatesCsvToObject;
import domain.contracts.Contracts;
import domain.contracts.ContractsConverter;
import domain.contracts.ContractsCsvToObject;
import domain.feedInfo.FeedInfo;
import domain.feedInfo.FeedInfoConverter;
import domain.feedInfo.FeedInfoCsvToObject;
import domain.route.Route;
import domain.route.RouteConverter;
import domain.route.RouteCsvToObject;
import util.CsvToBeans;

public class Main {
    private static List<Route> routes;
    private static List<Agency> agency;
    private static List<Calendar> calendar;
    private static List<CalendarDates> calendarDates;
    private static List<Contracts> contracts;
    private static List<FeedInfo> feedInfo;

    public static void main(String[] args) throws IOException {
//        asynchronousRequest();

        List<RouteCsvToObject> beans = CsvToBeans.read("cities/lahti/routes.txt", RouteCsvToObject.class);
        routes = beans
            .stream()
            .map(RouteConverter::convert)
            .collect(Collectors.toList());


        List<AgencyCsvToObject> aBeans = CsvToBeans.read("cities/lahti/agency.txt", AgencyCsvToObject.class);
        agency = aBeans
                .stream()
                .map(AgencyConverter::convert)
                .collect(Collectors.toList());

        List<CalendarCsvToObject> cBeans = CsvToBeans.read("cities/lahti/calendar.txt", CalendarCsvToObject.class);
        calendar = cBeans
                .stream()
                .map(CalendarConverter::convert)
                .collect(Collectors.toList());

        List<CalendarDatesCsvToObject> cdBeans = CsvToBeans.read("cities/lahti/calendar_dates.txt", CalendarDatesCsvToObject.class);
        calendarDates = cdBeans
                .stream()
                .map(CalendarDatesConverter::convert)
                .collect(Collectors.toList());

        List<ContractsCsvToObject> coBeans = CsvToBeans.read("cities/lahti/contracts.txt", ContractsCsvToObject.class);
        contracts = coBeans
                .stream()
                .map(ContractsConverter::convert)
                .collect(Collectors.toList());

        List<FeedInfoCsvToObject> fBeans = CsvToBeans.read("cities/lahti/feed_info.txt", FeedInfoCsvToObject.class);
        feedInfo = fBeans
                .stream()
                .map(FeedInfoConverter::convert)
                .collect(Collectors.toList());

//        routes.forEach(x -> System.out.println(x.getRouteType().getDescription()));
//        agency.forEach(x -> System.out.println(x.getAgencyName()));
//        calendar.forEach(x -> System.out.println(x.getMonday()));
//        calendarDates.forEach(x -> System.out.println(x.getDate()));
//        contracts.forEach(x -> System.out.println(x.getContractId()));
//        feedInfo.forEach(x -> System.out.println(x.getFeed_publisher_url()));

    }

    private static void asynchronousRequest() throws IOException {
        String encoding = Base64.getEncoder().encodeToString((System.getenv("USER") + ":" + System.getenv("PASSWORD")).getBytes());
        new Vehicleposition(encoding);
        new Tripupdate(encoding);
    }
}
