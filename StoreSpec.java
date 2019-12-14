package project;

import java.util.ArrayList;
import java.util.Date;

public class StoreSpec {

    private String name;
    private String type;
    private String location;
    private Date birthdate;
    ArrayList<Double> statistics;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirthdate() {
        return birthdate;
    }



}
