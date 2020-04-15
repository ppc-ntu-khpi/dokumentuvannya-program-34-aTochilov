package domain;
/**
 * Содержит реализацию методов
 * @author Andrei
 */
public class Manager extends Employee {

    /**
     * Устанавливает значения полей
     * @param employees
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Выводит список сотрудников
     * @return список сотрудников
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Инициализирует
     * @param employees 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор по умолчанию
     * Присваивает менеджеру 10 сотрудников
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Устанавливает значение полей
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Возвращает значение
     * @return 
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
   
}
