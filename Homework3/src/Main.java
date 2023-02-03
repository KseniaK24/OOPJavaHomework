import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Компания К");
        company1.addDepartment(new Department("Управление"));
        company1.addDepartment(new Department("Производства"));
        company1.addDepartment(new Department("Бухгалтерия"));
        int var = 0;
        while (var != 5){
            System.out.println("Выберите действие:\n0 - Принять на работу\n1 - Перевести в другой отдел\n2 - Уволить сотрудника");
            System.out.println("3 - Показать всех сотрудников компании\n4 - Показать все отделы\n5 - Выход");
            Scanner scan = new Scanner(System.in);
            var = scan.nextInt();
            if (var == 0) {
                System.out.println("Введите имя сотрудника: ");
                String name = scan.next();
                System.out.println("Введите дату рождения сотрудника ");
                String data = scan.next();
                System.out.println("Введите должность: ");
                String job = scan.next();
                System.out.println("Выберите отдел ");
                company1.showDepartments();
                int dep = scan.nextInt();
                Department d = company1.departments.get(dep);
                System.out.println(name + ", согласен работать? \n0 - нет, \n1 - да ");
                int consent = scan.nextInt();
                if (consent == 1) {
                    Worker w = new Worker(name, data, job, d);
                    d.addWorker(w);
                    company1.addWorker(w);
                    System.out.println("Сотрудник принят");
                }
            }
            if (var == 1){
                System.out.println("Выберите сотрудника: ");
                company1.showWorkers();
                int wr = scan.nextInt();
                Worker worked = company1.allWorkers.get(wr);
                System.out.println("Выберите отдел ");
                company1.showDepartments();
                int dep1 = scan.nextInt();
                Department d1 = company1.departments.get(dep1);
                System.out.println("Введите новую должность: ");
                String j = scan.next();
                System.out.println(worked.fullName + " согласен перевестись? \n0 - нет, \n1 - да  ");
                int consent1 = scan.nextInt();
                if(consent1 == 1) {
                    worked.department.workers.remove(worked);
                    company1.allWorkers.remove(worked);
                    d1.addWorker(worked);
                    company1.addWorker(worked);
                    worked.department = d1;
                    worked.jobTitle = j;
                    System.out.println("Сотрудник переведен");
                    }
            }
            if(var == 2){
                System.out.println("Выберите сотрудника: ");
                company1.showWorkers();
                int wr2 = scan.nextInt();
                Worker worker2 = company1.allWorkers.get(wr2);
                worker2.department.workers.remove(worker2);
                company1.allWorkers.remove(worker2);
                System.out.println("Сотрудник уволен");
            }
            if (var == 3){
                company1.showWorkers();
            }
            if (var == 4){
                company1.showDepartments();
            }
        }
    }









}