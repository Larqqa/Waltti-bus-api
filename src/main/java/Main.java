import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import data.Tripupdate;
import data.Vehicleposition;
import data.entity.*;
import domain.*;
import domain.StopTimes.StopTime;
import domain.Trips.Trip;
import domain.stops.Stop;
import service.converters.*;
import domain.calendar.Calendar;
import domain.calendarDates.CalendarDates;
import domain.routes.Route;
import domain.transfers.Transfer;
import util.CsvToBeans;

public class Main {
    private static List<Agency> agency;
    private static List<Calendar> calendar;
    private static List<CalendarDates> calendarDates;
    private static List<Contract> contracts;
    private static List<FeedInfo> feedInfo;
    private static List<Route> routes;
    private static List<Shape> shapes;
    private static List<StopTime> stopTimes;
    private static List<Stop> stops;
    private static List<Transfer> transfer;
    private static List<Translation> translation;
    private static List<Trip> trips;

    public static void main(String[] args) throws IOException {
//        asynchronousRequest();

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

        List<ContractCsvToObject> coBeans = CsvToBeans.read("cities/lahti/contracts.txt", ContractCsvToObject.class);
        contracts = coBeans
                .stream()
                .map(ContractConverter::convert)
                .collect(Collectors.toList());

        List<FeedInfoCsvToObject> fBeans = CsvToBeans.read("cities/lahti/feed_info.txt", FeedInfoCsvToObject.class);
        feedInfo = fBeans
                .stream()
                .map(FeedInfoConverter::convert)
                .collect(Collectors.toList());

        List<RouteCsvToObject> beans = CsvToBeans.read("cities/lahti/routes.txt", RouteCsvToObject.class);
        routes = beans
                .stream()
                .map(RouteConverter::convert)
                .collect(Collectors.toList());

        List<ShapeCsvToObject> shBeans = CsvToBeans.read("cities/lahti/shapes.txt", ShapeCsvToObject.class);
        shapes = shBeans
                .stream()
                .map(ShapeConverter::convert)
                .collect(Collectors.toList());

        List<StopTimeCsvToObject> stBeans = CsvToBeans.read("cities/lahti/stop_times.txt", StopTimeCsvToObject.class);
        stopTimes = stBeans
                .stream()
                .map(StopTimeConverter::convert)
                .collect(Collectors.toList());

        List<StopCsvToObject> stoBeans = CsvToBeans.read("cities/lahti/stops.txt", StopCsvToObject.class);
        stops = stoBeans
                .stream()
                .map(StopConverter::convert)
                .collect(Collectors.toList());

        List<TransferCsvToObject> trfBeans = CsvToBeans.read("cities/lahti/transfers.txt", TransferCsvToObject.class);
        transfer = trfBeans
                .stream()
                .map(TransferConverter::convert)
                .collect(Collectors.toList());

        List<TranslationCsvToObject> trsBeans = CsvToBeans.read("cities/lahti/translations.txt", TranslationCsvToObject.class);
        translation = trsBeans
                .stream()
                .map(TranslationConverter::convert)
                .collect(Collectors.toList());

        List<TripCsvToObject> triBeans = CsvToBeans.read("cities/lahti/trips.txt", TripCsvToObject.class);
        trips = triBeans
                .stream()
                .map(TripConverter::convert)
                .collect(Collectors.toList());

//        agency.forEach(x -> System.out.println(x.getAgencyName()));
//        calendar.forEach(x -> System.out.println(x.getMonday()));
//        calendarDates.forEach(x -> System.out.println(x.getDate()));
//        contracts.forEach(x -> System.out.println(x.getContractId()));
//        feedInfo.forEach(x -> System.out.println(x.getFeed_publisher_url()));
//        routes.forEach(x -> System.out.println(x.getRouteType().getDescription()));
//        shapes.forEach(x -> System.out.println(x.getShapePtLat()));
//        stopTimes.forEach(x -> System.out.println(x.getStopId()));
//        stops.forEach(x -> System.out.println(x.getLocationType()));
//        transfer.forEach(x -> System.out.println(x.getTransferType()));
//        translation.forEach(x -> System.out.println(x.getLang()));
//        trips.forEach(x -> System.out.println(x.getBikesAllowed()));

        List<StopTime> yeet = stopTimes.stream()
                .filter(x -> x.getTripId().equals("239_84736"))
                .collect(Collectors.toList());

        yeet.forEach(x -> System.out.println(x.toString()));

    }

    private static void asynchronousRequest() throws IOException {
        String encoding = Base64.getEncoder().encodeToString((System.getenv("USER") + ":" + System.getenv("PASSWORD")).getBytes());
        new Vehicleposition(encoding);
        new Tripupdate(encoding);
    }
}
