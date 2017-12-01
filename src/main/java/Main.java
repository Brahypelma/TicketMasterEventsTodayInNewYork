

import com.google.gson.Gson;
import model.Event;
import model.MainModel;

import java.io.IOException;
import java.util.List;


public class Main {
    private final static Gson GSON = new Gson();

    public static void main(String[] args) throws IOException {
        MainModel entryResponse = GSON.fromJson(Request.sendGet().toString(),MainModel.class);
        List<Event> eventList = entryResponse.get_embedded().getEvents();

        for (Event event:eventList) {
            System.out.println("Event name : " +event.getName());
            System.out.println("Start Time : " +event.getDates().getStart().getLocalTime());
            System.out.println("Event Place : " +event.get_embedded().getVenues().get(0).getName());
            System.out.println();
        }









    }



}
