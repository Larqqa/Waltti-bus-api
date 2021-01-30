package domain.calendarDates;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CalendarDates {
    String serviceId;
    String date;
    ExceptionType exceptionType;
}
