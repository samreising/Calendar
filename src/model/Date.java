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
            case "05": monthString = "May";
                    break;
            case "06": monthString = "June";
                    break;
            case "07": monthString = "July";
                    break;
            case "08": monthString = "August";
                    break;
            case "09": monthString = "September";
                    break;
            case "10": monthString = "October";
                    break;
            case "11": monthString = "November";
                    break;
            case "12": monthString = "December";
                    break;
        }
        return (monthString + " " + day + ", " + year);
    }
}
