import second.Person;
/**
 * @author Устинова Виктория Кирилловна
 * @version 1.0
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println("Имя: " + person.name);
        System.out.println("Возраст: " + person.age);
    }
    
}
