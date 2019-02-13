package be.riots.botclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Comparable<User> {

    private int id;
    private String name;
    private String password;
    private ArrayList<LogSession> logSessions;
    ArrayList<Route> routes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<LogSession> getLogSessions() {
        return logSessions;
    }

    public void setLogSessions(ArrayList<LogSession> logSessions) {
        this.logSessions = logSessions;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    @Override
    public int compareTo(User user) {
        //fix LOMBOK!!!!!!!!!!!!!
       return this.getName().compareTo(user.getName());
    }
}
