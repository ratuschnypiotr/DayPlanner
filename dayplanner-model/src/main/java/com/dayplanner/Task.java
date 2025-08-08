package com.dayplanner.model;

/**
 * This class will represent a task in our DayPlanner.
 * @author Piotr Ratuschny
 */
public class Task {
    private final int id;
    private final TaskTime startTime;
    private final TaskTime endTime;
    private Category category;
    private String title;
    private String description;
    private boolean completed = false;


    Task(int id, String title, String description, TaskTime startTime, TaskTime endTime, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.category = category;
    }

    Task(int id, String title, String description, TaskTime startTime, TaskTime endTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.category = null;
    }

    public void changeTitle(String newTitle) {
        this.title = newTitle;
    }

    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }

    public void changeStartTime(int hour, int minute) {
        this.startTime.setHour(hour);
        this.startTime.setMinute(minute);
    }

    public void changeEndTime(int hour, int minute) {
        this.endTime.setHour(hour);
        this.endTime.setMinute(minute);
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void changeCompleted() {
        completed = !completed;

    }
}
