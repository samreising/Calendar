package ui;

import model.*;

import java.util.ArrayList;

public class Calendar {

    public static void main(String[] args) {
        Date currentDate = new Date("03", "01", "2018");
        currentDate.getShortDate();
        currentDate.getLongDate();
        Date testEventDate = new Date("04", "28", "2018");
        Date testReminderDate = new Date("08", "27", "2018");
        Date testMeetingDate = new Date("01", "01", "2019");
        Date reminderDate = new Date("04", "27", "2018");

        Time testEventTime = new Time("12", "00");
        testEventTime.getTime();
        Time testReminderTime = new Time("00", "00");
        testReminderTime.getTime();
        Time testMeetingTime = new Time("19", "30");
        testMeetingTime.getTime();
        Time reminderTime = new Time("00", "00");

        Event samsBirthday = new Event(testEventDate, testEventTime, "Sam's Birthday");
        samsBirthday.setReminder(reminderDate, reminderTime, "It's his 26th Birthday tomorrow.");
        samsBirthday.getReminder();

        Reminder catherinesBirthday = new Reminder(testReminderDate,testReminderTime,"Catherine's Birthday");
        catherinesBirthday.setAdditionalNote("It's Catherine's birthday");
        catherinesBirthday.getAdditionalNote();

        Meeting newYears = new Meeting(testMeetingDate, testMeetingTime, "New Years Meeting");
        newYears.addAttendee("catkenns@gmail.com");
        newYears.listOfAttendees();
        newYears.addAttendee("dan@frllp.com");
        newYears.listOfAttendees();
        newYears.removeAttendee("dan@frllp.com");
        newYears.sendInvitations();

        Calendar calendar = new Calendar(currentDate, "samuel.p.reising@gmail.com");
        calendar.addEntry(samsBirthday);
        calendar.addEntry(catherinesBirthday);
        calendar.removeEntry(samsBirthday);

    }

    Date currentDate;
    String calendarEmail;
    private ArrayList<Entry> entries = new ArrayList<Entry>();

    public Calendar (Date date, String email) {
        currentDate = date;
        calendarEmail = email;
    }

    //MODIFIES: this
    //EFFECTS: Adds entry
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    //MODIFIES: this
    //EFFECTS: Removes entry
    public void removeEntry(Entry entry) {
        entries.remove(entry);
    }

    //MODIFIES: this
    //EFFECTS: Removes entry

    //getters

    //EFFECTS: Gets currentDate
    public String getCurrentDate() {
        return currentDate.getShortDate();
    }

    //EFFECTS: Gets calendarEmail
    public String getCalendarEmail() {
        return calendarEmail;
    }

    //EFFECTS: Contains entry?
    public boolean containsEntry(Entry entry) {
        if(entries.contains(entry)){
            return true;
        }
        else {
            return false;
        }
    }
}
