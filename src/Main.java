public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим","Минск",1988,"бренд-менеджер");
        maxim.greeting();
        Person anya = new Person("Аня","Москва",1993,"методист образовательных программ");
        anya.greeting();
        Person katia = new Person("Катя","Калининград",1992,"продакт-менеджер");
        katia.greeting();
        Person artem = new Person("Артём","Москва",1995,"директор по развитию бизнеса");
        artem.greeting();
    }
}