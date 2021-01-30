package domain.transfers;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Transfer {
    Integer fromStopId;
    Integer toStopId;
    Integer fromRouteId;
    Integer toRouteId;
    Integer fromTripId;
    Integer toTripId;
    TransferType transferType;
    Integer minTransferTime;
}
