package model;

public abstract class Entry {

    Date date;
    Time time;
    String label;
    String repetitionInterval;
    boolean repeating;

    public Entry(Date entryDate, Time entryTime, String entryLabel) {
        date = entryDate;
        time = entryTime;
        label = entryLabel;
    }

    //getters

    //EFFECTS: gets entryDate
    public String getEntryDate(){
        return date.getShortDate();
    }

    //EFFECTS: gets entryTime
    public String getEntryTime(){
        return time.getTime();
    }

    //EFFECTS: gets entryLabel
    public String getEntryLabel() {
        return label;
    }

    //EFFECTS: gets repetition interval
    public String getRepetitionInterval(){
        return repetitionInterval;
    }

    //EFFECTS gets whether entry is repeating
    public boolean isRepeating(){
        if(repeating){
            return true;
        }
        else{
            return false;
        }
    }

    //setters

    //MODIFIES: this
    //EFFECTS: set repetition interval
    public void setRepetitionInterval(String interval) {
        repetitionInterval = interval;
        repeating = true;
    }

}
