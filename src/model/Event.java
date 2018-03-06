package model;

public class Event extends Entry {

    public Reminder reminder;

    public Event(Date entryDate, Time entryTime, String entryLabel) {
        super(entryDate, entryTime, entryLabel);
    }

    //setters

    //MODIFIES: this
    //EFFECTS: Set reminder
    public void setReminder(Date entryDate, Time entryTime, String entryLabel) {
        reminder = new Reminder(entryDate, entryTime, entryLabel);
    }

    //getters

    //REQUIRES: Reminder is not void
    //EFFECTS: Get reminder
    public Reminder getReminder() {
        if(reminder != null) {
            return reminder;
        }
        else {
            return null;
        }
    }
}
