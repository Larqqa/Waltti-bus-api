package domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Translation {
    Integer transId;
    String lang;
    String translation;
}
