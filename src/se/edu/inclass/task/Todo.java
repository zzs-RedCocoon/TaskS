package se.edu.inclass.task;

public class Todo extends Task {

    public Todo(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{Todo: " + description + '}';
    }

}
