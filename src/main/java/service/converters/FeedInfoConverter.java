package service.converters;

import domain.FeedInfo;
import data.entity.FeedInfoCsvToObject;

import java.net.URI;

public class FeedInfoConverter {
    public FeedInfoConverter() {}

    public static FeedInfo convert(FeedInfoCsvToObject input) {
        return FeedInfo.builder()
                .feedPublisherName(input.getFeedPublisherName())
                .feedPublisherUrl(URI.create(input.getFeedPublisherUrl()))
                .feedLang(input.getFeedLang())
                .feedStartDate(input.getFeedStartDate())
                .feedEndDate(input.getFeedEndDate())
                .feedVersion(input.getFeedVersion())
                .build();
    }
}
