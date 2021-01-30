package domain.calendarDates;

import static java.lang.Integer.parseInt;

public class CalendarDatesConverter {
    public CalendarDatesConverter() {}

    public static CalendarDates convert(CalendarDatesCsvToObject input) {
        return CalendarDates.builder()
                .serviceId(input.getServiceId())
                .date(input.getDate())
                .exceptionType(ExceptionType.getEnumById(parseInt(input.getExceptionType())))
                .build();
    }
}
