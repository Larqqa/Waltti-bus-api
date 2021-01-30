package service.converters;

import domain.transfers.Transfer;
import data.entity.TransferCsvToObject;
import domain.transfers.TransferType;

import static java.lang.Integer.parseInt;

public class TransferConverter {
    public TransferConverter() {}

    public static Transfer convert(TransferCsvToObject input) {
        return Transfer.builder()
                .fromStopId(parseInt(input.getFromStopId()))
                .toStopId(parseInt(input.getToStopId()))
                .fromRouteId(parseInt(input.getFromRouteId()))
                .toRouteId(parseInt(input.getToRouteId()))
                .fromTripId(parseInt(input.getFromTripId()))
                .toTripId(parseInt(input.getToRouteId()))
                .transferType(TransferType.getEnumById(parseInt(input.getTransferType())))
                .minTransferTime(parseInt(input.getMinTransferTime()))
                .build();
    }
}
