package pl.javastart.task;

public class TaskTest {

    public static void main(String[] args) {
        Person person1 = new Person("Marcin", "Kowalski");
        Person person2 = new Person("Dawid", "Waluś");
        Person person3 = new Person("Ernest", "Pogorzelski");

        Task task1 = new Task("Odkurzanie", "Poodkurzaj dom");
        Task task2 = new Task("Mycie", "Umyj podłogi", 0);
        Task task3 = new Task("Mycie", "Umyj podłogi", 1, person1);
        Task task4 = new Task("Mycie", "Umyj naczynia", 0, person2);
        Task task5 = new Task("Mycie", "Umyj okna", -1, person3);

        boolean priority3 = task3.lowPriority();
        boolean priority4 = task4.lowPriority();
        boolean priority5 = task5.lowPriority();

        System.out.println(task3.lowPriority());
        System.out.println(task4.lowPriority());
        System.out.println(task5.lowPriority());
    }
}
