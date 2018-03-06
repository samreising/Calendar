package model;

public class Date {
    String month;
    String day;
    String year;

    public Date(String dateMonth, String dateDay, String dateYear) {
        month = dateMonth;
        day = dateDay;
        year = dateYear;

    }

    // getters

    //EFFECTS: gets the date in a short format MM/DD/YYY
    public String getShortDate() {
        return (month + "/" + day + "/" + year);
    }

    //EFFECTS: gets the date in a long format Month Day, Year
    public String getLongDate() {
        String monthString = null;
        switch (month) {
            case "01": monthString = "January";
                    break;
            case "02": monthString = "Feburary";
                    break;
            case "03": monthString = "March";
                    break;
            case "04": monthString = "April";
                    break;
            case "05": monthString = "April";
                    break;
            case "06": monthString = "April";
                    break;
            case "07": monthString = "April";
                    break;
            case "08": monthString = "April";
                    break;
            case "09": monthString = "April";
                    break;
            case "10": monthString = "April";
                    break;
            case "11": monthString = "April";
                    break;
            case "12": monthString = "April";
                    break;
        }
        return (monthString + " " + day + ", " + year);
    }
}
