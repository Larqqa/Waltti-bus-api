package domain.calendar;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Calendar {
    String serviceId;
    DateEnum monday;
    DateEnum tuesday;
    DateEnum wednesday;
    DateEnum thursday;
    DateEnum friday;
    DateEnum saturday;
    DateEnum sunday;
    String startDate;
    String endDate;
}
