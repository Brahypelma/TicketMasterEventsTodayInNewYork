import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


class Request {

    static StringBuffer sendGet() throws IOException {

        //I have set current time in StartDateTime to show actual info about events
        final String startDateTime = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'").format(new Date(System.currentTimeMillis()));
        final String endDateTime = new SimpleDateFormat("YYYY-MM-dd'T'23:59:00'Z'").format(new Date(System.currentTimeMillis()));

        System.out.println("Searching actual event");

        String get = "https://app.ticketmaster.com/discovery/v2/events.json?city=new+york&startDateTime="
                + startDateTime
                + "&endDateTime="
                + endDateTime
                + "&apikey=dRFGteuRzMBPMSTEW9joy8zPVgsANKgy";

        URL url = new URL(get);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response;
    }

}
