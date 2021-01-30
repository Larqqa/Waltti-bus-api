package domain;

import lombok.Builder;
import lombok.Value;

import java.net.URI;

@Value
@Builder
public class FeedInfo {
    String feedPublisherName;
    URI feedPublisherUrl;
    String feedLang;
    String feedStartDate;
    String feedEndDate;
    String feedVersion;
}
