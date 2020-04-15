package domain;
/**
 * Содержит реализацию методов для установки и получения значений переменных
 * 
 * @author Andrei
 */
public class Artist extends Employee {

    /**
     * Устанавливает значение полей
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Устанавливает значение полей
     * @param skiils 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Создает объект класса {@linkplain Artist}
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Выводит строку навыков
     * @return  Навыки в виде строки
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Создает строку навыков
     * @return Навыки в виде строки
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Устанавливает навык
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Возвращает навык
     * @return skiils
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
