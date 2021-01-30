package domain.agency;

import java.net.URI;

import static java.lang.Integer.parseInt;

public final class AgencyConverter {
    public AgencyConverter() {}

    public static Agency convert(AgencyCsvToObject input) {
        return Agency.builder()
                .agencyId(parseInt(input.getAgencyId()))
                .agencyName(input.getAgencyName())
                .agencyUrl(URI.create(input.getAgencyUrl()))
                .agencyTimezone(input.getAgencyTimezone())
                .agencyEmail(input.getAgencyEmail())
                .agencyBrandingUrl(URI.create(input.getAgencyBrandingUrl()))
                .build();
    }
}
