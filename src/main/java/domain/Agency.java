package domain;

import lombok.Builder;
import lombok.Value;

import java.net.URI;

@Value
@Builder
public class Agency {
    Integer agencyId;
    String agencyName;
    URI agencyUrl;
    String agencyTimezone;
    String agencyEmail;
    URI agencyBrandingUrl;
}
