package com.dayplanner.model;

public class TaskTime {
    private static final String TIME_FORMAT = "%02d:%02d";
    private int hour;
    private int minute;

    public TaskTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public String getTime() {
        return String.format(TIME_FORMAT, hour, minute);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
