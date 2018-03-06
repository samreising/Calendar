package model;

import java.util.ArrayList;

public class Meeting extends Event {

    public ArrayList<String> attendees = new ArrayList<String>();

    public Meeting(Date entryDate, Time entryTime, String entryLabel) {
        super(entryDate, entryTime, entryLabel);
    }

    //MODIFIES: this
    //EFFECTS: Adds an attendee's email address to attendees
    public void addAttendee(String attendeeEmailAddress) {
        attendees.add(attendeeEmailAddress);
    }

    //MODIFIES: this
    //EFFECTS: Removes an attendee's email address to attendees
    public void removeAttendee(String attendeeEmailAddress) {
        attendees.remove(attendeeEmailAddress);
    }

    //EFFECTS: Send invitations
    public String sendInvitations() {
        String printInvitations = new String();
        for(String attendee : attendees) {
            printInvitations += ("Inviting: "+attendee+"\n");
        }
        return printInvitations;
    }

    // getters

    //EFFECTS: Prints out list of attendees
    public String listOfAttendees(){
        String printAttendees = new String();
        for(String attendee : attendees) {
            printAttendees += (attendee+"\n");
        }
        return printAttendees;
    }
}
