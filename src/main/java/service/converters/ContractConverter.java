package service.converters;

import domain.Contract;
import data.entity.ContractCsvToObject;

import static java.lang.Integer.parseInt;

public class ContractConverter {
    public ContractConverter() {}

    public static Contract convert(ContractCsvToObject input) {
        return Contract.builder()
                .routeId(parseInt(input.getRouteId()))
                .contractId(parseInt(input.getContractId()))
                .updatePermission(parseInt(input.getUpdatePermission()))
                .contractType(parseInt(input.getContractType()))
                .build();
    }
}
