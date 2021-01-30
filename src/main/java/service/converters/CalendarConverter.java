package service.converters;

import domain.calendar.Calendar;
import data.entity.CalendarCsvToObject;
import domain.calendar.DateEnum;

import static java.lang.Integer.parseInt;

public class CalendarConverter {
    public CalendarConverter() {}

    public static Calendar convert(CalendarCsvToObject input) {
        return Calendar.builder()
                .serviceId(input.getServiceId())
                .monday(DateEnum.getEnumById(parseInt(input.getMonday())))
                .tuesday(DateEnum.getEnumById(parseInt(input.getTuesday())))
                .wednesday(DateEnum.getEnumById(parseInt(input.getWednesday())))
                .thursday(DateEnum.getEnumById(parseInt(input.getThursday())))
                .friday(DateEnum.getEnumById(parseInt(input.getFriday())))
                .saturday(DateEnum.getEnumById(parseInt(input.getSaturday())))
                .sunday(DateEnum.getEnumById(parseInt(input.getSunday())))
                .startDate(input.getStartDate())
                .endDate(input.getEndDate())
                .build();
    }
}
