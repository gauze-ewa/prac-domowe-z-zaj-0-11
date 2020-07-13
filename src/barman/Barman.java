package barman;

public class Barman {
    public void order(Person person, Drink drink) {
        if ((person.getAge() < 18) && (drink.isAlcohol() == true)) {
            System.out.println("Nie sprzedajemy alkoholu nieletnim");
        } else {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " twój drink \"" + drink.getNameDrtnk() +
                    "\" jest gotowy do odbioru. Kwota do zapłaty: " + drink.getPrice() + "zł.");
        }
    }
}
