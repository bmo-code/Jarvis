package fr.multibrain.web.rest;

import com.codahale.metrics.annotation.Timed;
import fr.multibrain.service.GoogleCalendarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.services.calendar.model.*;

import java.io.IOException;


@RestController
@RequestMapping("/api")
public class GoogleCalendarRessource {

    @GetMapping("/next10event")
    @Timed
    public Event getNext10Event() throws IOException {
        GoogleCalendarService gcalService = new GoogleCalendarService();
        return gcalService.getNext10Events();
    }

}
