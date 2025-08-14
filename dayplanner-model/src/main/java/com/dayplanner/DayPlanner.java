package com.dayplanner;

import java.util.List;

public class DayPlanner {
    private final List<Task> tasks;
    private final List<Category> categories;

    DayPlanner(List<Task> tasks, List<Category> categories) {
        this.tasks = tasks;
        this.categories = categories;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }
}
