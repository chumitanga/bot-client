package be.riots.botclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Comparable<User> {

    private long id;
    private long height;
    private String name;
    private String location;
    private GpsSensor gpsSensor;

    public User() {
    }

    public User(long id, long height, String name, String location, GpsSensor gpsSensor) {
        this.id = id;
        this.height = height;
        this.name = name;
        this.location = location;
        this.gpsSensor = gpsSensor;
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GpsSensor getGpsSensor() {
        return gpsSensor;
    }

    public void setGpsSensor(GpsSensor gpsSensor) {
        this.gpsSensor = gpsSensor;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "id=" + id +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", coordinates=" + gpsSensor +
                '}';
    }

    @Override
    public int compareTo(User user) {
        return (int)(this.getHeight() - user.getHeight());
       // return this.getName().compareTo(mountain.getName());
    }
}
