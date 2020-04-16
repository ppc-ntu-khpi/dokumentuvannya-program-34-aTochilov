package domain;
/**
 * Содержит реализацию методов
 * @author Andrei
 */
public class Employee {

    /**
     * Выводит значение
     * @return Данные о работнике
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Устанавливает значения полей
     * @param name
     * @param jobTitle
     * @param level
     * @param dept
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор по умолчанию
     * Устанавливает значение поля ID
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Устанавливает профессию сотрудника
     * @param job 
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Возвращает профессию сотрудника
     * @return должность
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Возвращает имя сотрудника
     * @return Имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливет значение поля level
     * @param level 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Возвращает значение поля level
     * @return Уровень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Возвращает отдел, в котором работает сотрудник
     * @return Отдел
     */
    public String getDept() {
        return dept;
    }

    /**
     * Устанавливает отдел, в котором работает сотрудник
     * @param dept 
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Устанавливает имя сотрудника
     * @param name 
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
