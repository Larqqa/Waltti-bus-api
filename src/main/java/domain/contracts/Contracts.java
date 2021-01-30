package domain.contracts;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Contracts {
    int routeId;
    int contractId;
    int updatePermission;
    int contractType;
}
