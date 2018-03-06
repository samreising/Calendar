package tests;

import model.Date;
import model.Event;
import model.Meeting;
import model.Time;
import org.junit.Before;
import org.junit.Test;
import ui.Calendar;

import static org.junit.Assert.assertEquals;

public class CalendarTests {
    public Calendar testCalendar;
    public Date testEventDate;
    public Time testEventTime;
    public String testEventLabel;
    public Date testMeetingDate;
    public Time testMeetingTime;
    public String testMeetingLabel;
    public Event testEvent;
    public Meeting testMeeting;

    @Before
    public void setUp(){
        testCalendar = new Calendar(new Date("03", "01", "2018"), "samuel.p.reising@gmail.com");
        testEventDate = new Date("04", "28", "2018");
        testEventTime = new Time ("19", "07");
        testEventLabel = "Sam's Birthday";
        testMeetingDate = new Date("08", "27", "2018");
        testMeetingTime = new Time ("8", "23");
        testMeetingLabel = "Catherine's Birthday";
        testEvent = new Event(testEventDate, testEventTime, testEventLabel);
        testEvent.setReminder(new Date("04", "27", "2018"), new Time("00","00"),"Tomorrow is Sam's Birthday");
        testMeeting = new Meeting(testMeetingDate, testMeetingTime, testMeetingLabel);
        testCalendar.addEntry(testEvent);
        testCalendar.addEntry(testMeeting);
    }

    @Test
    public void testGetCurrentDate() {
        assertEquals(testCalendar.getCurrentDate(), "03/01/2018");
    }

    @Test
    public void testGetCalendarEmail() {
        assertEquals(testCalendar.getCalendarEmail(), "samuel.p.reising@gmail.com");
    }

    @Test
    public void testGetEntryDate() {
        assertEquals(testEvent.getEntryDate(), "04/28/2018");
        assertEquals(testEvent.getReminder().getEntryDate(), "04/27/2018");
        assertEquals(testMeeting.getEntryDate(), "08/27/2018");
    }

    @Test
    public void testGetEntryTime() {
        assertEquals(testEvent.getEntryTime(), "19:07");
        assertEquals(testEvent.getReminder().getEntryTime(), "00:00");
        assertEquals(testMeeting.getEntryTime(), "8:23");
    }

    @Test
    public void testGetEntryLabel() {
        assertEquals(testEvent.getEntryLabel(), "Sam's Birthday");
        assertEquals(testEvent.getReminder().getEntryLabel(), "Tomorrow is Sam's Birthday");
        assertEquals(testMeeting.getEntryLabel(), "Catherine's Birthday");
    }

    @Test
    public void testGetRepetitionInterval() {
        testEvent.setRepetitionInterval("Annual");
        assertEquals(testEvent.getRepetitionInterval(), "Annual");
        assertEquals(testMeeting.getRepetitionInterval(), null);
    }

    @Test
    public void testIsRepeating() {
        testMeeting.setRepetitionInterval("Annual");
        assertEquals(testMeeting.isRepeating(), true);
        assertEquals(testEvent.isRepeating(), false);
    }

    @Test
    public void testGetAdditionalNote() {
        testEvent.getReminder().setAdditionalNote("I love Sam so much <3");
        assertEquals(testEvent.getReminder().getAdditionalNote(), "I love Sam so much <3");
    }

    @Test
    public void testListOfAttendees() {
        assertEquals(testMeeting.listOfAttendees(), "");
        testMeeting.addAttendee("sreising92@gmail.com");
        assertEquals(testMeeting.listOfAttendees(), "sreising92@gmail.com\n");
        testMeeting.addAttendee("mafasisbro@yahoo.com");
        assertEquals(testMeeting.listOfAttendees(), "sreising92@gmail.com\n" +
                "mafasisbro@yahoo.com\n");
        testMeeting.removeAttendee("sreising92@gmail.com");
        assertEquals(testMeeting.listOfAttendees(), "mafasisbro@yahoo.com\n");
    }

    @Test
    public void testSendInvitations() {
        assertEquals(testMeeting.sendInvitations(), "");
        testMeeting.addAttendee("sreising92@gmail.com");
        assertEquals(testMeeting.sendInvitations(), "Inviting: sreising92@gmail.com\n");
        testMeeting.addAttendee("mafasisbro@yahoo.com");
        assertEquals(testMeeting.sendInvitations(), "Inviting: sreising92@gmail.com\n" +
                "Inviting: mafasisbro@yahoo.com\n");
        testMeeting.removeAttendee("sreising92@gmail.com");
        assertEquals(testMeeting.sendInvitations(), "Inviting: mafasisbro@yahoo.com\n");
    }

    @Test
    public void testRemoveEntry() {
        assertEquals(testCalendar.containsEntry(testEvent), true);
        testCalendar.removeEntry(testEvent);
        assertEquals(testCalendar.containsEntry(testEvent), false);
    }
}
