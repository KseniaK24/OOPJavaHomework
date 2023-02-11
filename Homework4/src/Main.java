import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planner pl = new Planner("My planner", new Human("Ivanov"));
        pl.addTask(new Task<String>("task1", "важно", 5));
        pl.addTask(new Task<Integer>("task2", 2, 2));
        pl.addTask(new Task<Integer>("task3", 1, 4));
        pl.addTask(new Task<Integer>("task4", 1, 4));
        pl.addTask(new Task<String>("task5", "важно", 2));

        System.out.println("Добро пожаловать в " + pl.name);

        Scanner scan = new Scanner(System.in);
        int act = 0;
        while (act != 4) {
            System.out.println("Выберите действие:\n1 - Добавить задачу,\n2 - Удалить задачу\n3 - Показать все задачи\n4 - Выход");
            act = scan.nextInt();
            if (act == 1) {
                System.out.println("Введите задачу: ");
                String task = scan.next();
                System.out.println("Введите срок выполнения в днях");
                int dl = scan.nextInt();
                System.out.println("Выберите приоритет:\n1 - приоритет 1\n2 - приоритет 2\n3 - важно");
                int pr = scan.nextInt();
                if (pr == 1) {
                    pl.addTask(new Task<Integer>(task, 1, dl));
                }
                if (pr == 2) {
                    pl.addTask(new Task<Integer>(task, 2, dl));
                }
                if (pr == 3) {
                    pl.addTask(new Task<String>(task, "важно", dl));
                }
                System.out.println("Задача добавлена");
            }
            if (act == 2) {
                System.out.println("Выберите задачу");
                pl.showTasks();
                int val = scan.nextInt();
                pl.deleteTask(pl.allTask.get(val-1));
                System.out.println("Задача удалена");
            }
            if (act == 3) {
                pl.showTasks();
            }
        }
    }


}