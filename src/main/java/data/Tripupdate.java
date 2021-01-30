package data;

import com.google.transit.realtime.GtfsRealtime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Tripupdate {
    public Tripupdate(String auth) throws IOException {
        var uri2 = URI.create("https://data.waltti.fi/lahti/api/gtfsrealtime/v1.0/feed/tripupdate");
        URL url2 = new URL(uri2.toString());
        var con2 = (HttpURLConnection) url2.openConnection();
        con2.setRequestProperty("Authorization", "Basic " + auth);

        GtfsRealtime.FeedMessage feed2 = GtfsRealtime.FeedMessage.parseFrom(con2.getInputStream());
        for (GtfsRealtime.FeedEntity entity : feed2.getEntityList()) {
//            System.out.println(entity);
        }
    }
}
