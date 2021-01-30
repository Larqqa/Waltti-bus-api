package domain.agency;

import lombok.Builder;
import lombok.Value;

import java.net.URI;

@Value
@Builder
public class Agency {
    int agencyId;
    String agencyName;
    URI agencyUrl;
    String agencyTimezone;
    String agencyEmail;
    URI agencyBrandingUrl;
}
