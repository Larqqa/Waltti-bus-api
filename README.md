# Waltti bus API
### Very much a WIP

It uses the [Waltti opendata API](https://opendata.waltti.fi/getting-started) to fetch realtime data about Finnish bus traffic.
For example real time location data and speed.

End goal is to have a WebSocket server that serves the location data of the busses, that can then be implemented to mobile / web applications.

Included are the Static GTFS packages for additional information about the bus routes.
These packages should go into `/resources/cities/[city name]`

The GTFS packages are available under CC4.0BY license