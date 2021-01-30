package domain.contracts;

import static java.lang.Integer.parseInt;

public class ContractsConverter {
    public ContractsConverter() {}

    public static Contracts convert(ContractsCsvToObject input) {
        return Contracts.builder()
                .routeId(parseInt(input.getRouteId()))
                .contractId(parseInt(input.getContractId()))
                .updatePermission(parseInt(input.getUpdatePermission()))
                .contractType(parseInt(input.getContractType()))
                .build();
    }
}
