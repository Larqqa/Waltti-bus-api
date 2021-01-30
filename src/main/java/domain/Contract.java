package domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Contract {
    Integer routeId;
    Integer contractId;
    Integer updatePermission;
    Integer contractType;
}
