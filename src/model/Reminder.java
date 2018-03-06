package model;

public class Reminder extends Entry {
    String additionalNote;

    public Reminder(Date entryDate, Time entryTime, String entryLabel) {
        super(entryDate, entryTime, entryLabel);
    }

    //setters
    //MODIFIES: this
    //EFFECTS: Sets an additional note
    public void setAdditionalNote(String note) {
        additionalNote = note;
    }

    //getters

    //EFFECTS: Gets an additional note
    public String getAdditionalNote() {
        return additionalNote;
    }

}
