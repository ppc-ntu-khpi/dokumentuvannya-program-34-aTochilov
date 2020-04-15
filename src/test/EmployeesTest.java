package test;

import domain.*;
/**
 * Вычисление и отображение результатов.
 * Содержит реализацию статического метода main().
 * @author Andrei
 */
public class EmployeesTest {

    /**
     * Выполняется при запуске программы.
     * Результаты вычислений выводятся на экран.
     * @param args Выполняется при запуске программы.
     */
    public static void main(String args[]) {

        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        Artist art = new Artist(skills);
        Employee[] people = {ed, em, art};
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        System.out.println(man);

    }
}
