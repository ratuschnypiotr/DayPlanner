package model;

import java.util.List;

public class Category {
    private String categoryName;
    private String categoryDescription;
    private int categoryColorCode; // hexadecimal
    List<Task> taskList;

    Category(String categoryName, String categoryDescription, int categoryColor) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryColorCode = categoryColor;
    }

    public void changeColor(int colorCode) {
        this.categoryColorCode = colorCode;
    }

    public void addTask(Task task) {
        taskList.add(task);
        task.setCategory(this);
    }
}
