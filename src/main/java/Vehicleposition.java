import com.google.transit.realtime.GtfsRealtime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Vehicleposition {
    public Vehicleposition(String auth) throws IOException {
        var uri = URI.create("https://data.waltti.fi/lahti/api/gtfsrealtime/v1.0/feed/vehicleposition");
        URL url = new URL(uri.toString());
        var con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Authorization", "Basic " + auth);

        GtfsRealtime.FeedMessage feed = GtfsRealtime.FeedMessage.parseFrom(con.getInputStream());
        for (GtfsRealtime.FeedEntity entity : feed.getEntityList()) {
            System.out.println(entity);
//            System.out.println(entity.getVehicle().getTrip().getRouteId());
        }
    }
}
