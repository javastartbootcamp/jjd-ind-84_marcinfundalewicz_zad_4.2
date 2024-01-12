package pl.javastart.task;

public class Task {
    Person person;

    String name;
    String description;
    int priority;

    Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;

    }

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        if (priority <= 0) {
            return false;
        }
        return true;
    }

    boolean mediumPriority() {
        if (priority > 0 && priority < 0) {
            return false;
        }
        return true;
    }

    boolean lowPriority() {
        if (priority >= 0) {
            return false;
        }
        return true;
    }
}

