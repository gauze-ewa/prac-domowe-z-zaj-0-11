package barman;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Witamy w barze co podać?");

        Person person1 = new Person("Ania", "Kowalska", 16);
        Person person2 = new Person("Krzysztof", "Kowalski", 26);

        Drink drink1 = new Drink("Polish professor", 17.5, true);
        Drink drink2 = new Drink("Virgin Sunshine", 12.5, false);

        Barman barman=new Barman();
        barman.order(person1,drink1);
        barman.order(person1,drink2);
        barman.order(person2,drink1);
        barman.order(person2,drink2);
    }
}
