package domain;
/**
 * Содержит реализацию методов
 * 
 * @author Andrei
 */
public class Editor extends Artist {

    /**
     * Устанавливает значение полей
     * @param electronicEditing наличие навыка electronicEditing
     * @param skiils навыки
     * @param name имя
     * @param jobTitle должность
     * @param level уровень
     * @param dept отдел
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Устанавливает значение полей
     * @param electronicEditing наличие навыка electronicEditing
     * @param skiils навыки
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Устанавливает значение полей
     * @param electronicEditing наличие навыка electronicEditing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор по умолчанию
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Вывод строки
     * @return s
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Возвращает значение
     * @return true если есть навык electronicEditing, false - если нет
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
   
    /**
     * Устанавливает значение
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
