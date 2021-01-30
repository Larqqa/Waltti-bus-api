package domain.feedInfo;

import java.net.URI;

public class FeedInfoConverter {
    public FeedInfoConverter() {}

    public static FeedInfo convert(FeedInfoCsvToObject input) {
        return FeedInfo.builder()
                .feed_publisher_name(input.getFeed_publisher_name())
                .feed_publisher_url(URI.create(input.getFeed_publisher_url()))
                .feed_lang(input.getFeed_lang())
                .feed_start_date(input.getFeed_start_date())
                .feed_end_date(input.getFeed_end_date())
                .feed_version(input.getFeed_version())
                .build();
    }
}
