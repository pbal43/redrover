package hw.hw_7;

public class fighters {
    public void main(String[] args) {

        Kata kata = new Kata();

        Fighter lew = new Fighter("Lew", 10, 2);

        Fighter harry = new Fighter("Harry", 5, 4);

        String a = kata.declareWinner(lew, harry, "Lew");

        System.out.println(a);
    }

    public class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public class Kata {
        public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            int counter;
            if (fighter1.name.equals(firstAttacker)) {
                counter = 1;
            } else {
                counter = 2;
            }
            while (fighter1.health > 0 && fighter2.health > 0) {
                if (counter % 2 != 0) {
                    fighter2.health -= fighter1.damagePerAttack;
                } else {
                    fighter1.health -= fighter2.damagePerAttack;
                }
                counter++;
            }
            if (counter % 2 != 0) {
                return fighter2.name;
            } else {
                return fighter1.name;
            }
        }
    }
}
