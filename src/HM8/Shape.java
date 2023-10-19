package HM8;

public class Shape {
    // створюю поле з назвою фігури
    private String name;
    // запозичена палітра на Stack over flow
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // створюю методи get та set, тому що я використовую принцип інкапсуляції
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // перевизначаю метод toString та використовую кольори для виведення тексту
    @Override
    public String toString() {
        // використовую конструкцію if elseif, в якій введене ім'я фігури повертається іншим кольором
        if (name.equals("Коло")) {
        return ANSI_PURPLE + name + ANSI_RESET;
        } else if (name.equals("Прямокутник")) {
            return ANSI_YELLOW + name + ANSI_RESET;
        }else if (name.equals("Овал")) {
            return ANSI_BLUE + name + ANSI_RESET;
        }else if (name.equals("Зірка")) {
            return ANSI_RED + name + ANSI_RESET;
        }else if (name.equals("Квадрат")) {
            return ANSI_CYAN + name + ANSI_RESET;
        }
        else
            return  ANSI_WHITE + "Немає такої фігури" + ANSI_RESET;
    }
}
