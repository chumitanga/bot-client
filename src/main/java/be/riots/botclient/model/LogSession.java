package be.riots.botclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogSession {
    private LocalDate date;
    private ArrayList<Log> logs;

}
