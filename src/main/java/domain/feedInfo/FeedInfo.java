package domain.feedInfo;

import lombok.Builder;
import lombok.Value;

import java.net.URI;

@Value
@Builder
public class FeedInfo {
    String feed_publisher_name;
    URI feed_publisher_url;
    String feed_lang;
    String feed_start_date;
    String feed_end_date;
    String feed_version;
}
