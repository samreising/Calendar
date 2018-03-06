package model;

public class Time {
    String hours;
    String minutes;

    public Time (String timeHours, String timeMinutes) {
        hours = timeHours;
        minutes = timeMinutes;
    }

    //getters

    //EFFECTS: print out time hours:minutes
    public String getTime() {
        return (hours + ":" + minutes);
    }
}
