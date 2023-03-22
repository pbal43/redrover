package hw.hw_7;

public class Hw_7 {

    public static void main(String[] args) {

        //    1

        System.out.println("===========1===========");

        Person_hw_7 person = new Person_hw_7();
        person.name = "Diggidi";
        person.sex = "Female";
        String answer_1 = person.getName();
        System.out.println(answer_1);


        //    2

        System.out.println("===========2===========");

        Employee_hw_7 employee_1 = new Employee_hw_7();
        employee_1.name = "Valya";
        Employee_hw_7 employee_2 = new Employee_hw_7();
        employee_2.name = "Valy2a";
        boolean result_2 = employee_1.isSameName(employee_2);
        System.out.println(result_2);

        //    3

        System.out.println("===========3===========");

        Employee_hw_7 employee_3 = new Employee_hw_7();
        employee_3.salary = 228;

        Employee_hw_7 employee_4 = new Employee_hw_7();
        employee_4.salary = 228.5;

        Employee_hw_7 employee_5 = new Employee_hw_7();

        Salary_hw_7 salaries = new Salary_hw_7();

        Employee_hw_7[] empls = {employee_3, employee_4, employee_5};

        double sum_salaries = salaries.getSum(empls);

        System.out.println(sum_salaries);

        //    4

        System.out.println("===========4===========");

//        public class Cube{
//
//            //create a class member integers called "side"
//            private int Side;
//
//            // Get method
//            public int getSide() {
//                return Side;
//            }
//
//            //set method
//            public void setSide(int num){
//                this.Side = num;
//            }
//
//
//        }

        //    5

        System.out.println("===========5===========");

//        public class Block{
//
//            int width;
//
//            int lenght;
//
//            int height;
//
//            public Block(int[] array) {
//                this.width = array[0];
//                this.lenght = array[1];
//                this.height = array[2];
//            }
//
//            int getWidth() {
//                return width;
//            }
//
//            int getLength() {
//                return lenght;
//            }
//
//            int getHeight() {
//                return height;
//            }
//
//            int getVolume() {
//                return width * lenght * height;
//            }
//
//            int getSurfaceArea() {
//                return 2 * (width * lenght + width * height + lenght * height);
//            }
//
//        }


//        или

//        public class Block{
//            private int width;
//            private int length;
//            private int height;
//            private int volume;
//            private int surface_area;
//
//            // Constructor
//            public Block(int[] params) {
//                width = params[0];
//                length = params[1];
//                height = params[2];
//
//                volume = width * length * height;
//                surface_area = 2 * (width * length + width * height + length * height);
//            }
//
//            public int getWidth() {
//                return width;
//            }
//
//            public int getLength() {
//                return length;
//            }
//
//            public int getHeight() {
//                return height;
//            }
//
//            public int getVolume() {
//                return volume;
//            }
//
//            public int getSurfaceArea() {
//                return surface_area;
//            }
//        }


        //    Extra

        System.out.println("===========Extra===========");

//        public class fighters {
//            public void main(String[] args) {
//
//                hw.hw_7.fighters.Kata kata = new hw.hw_7.fighters.Kata();
//
//                hw.hw_7.fighters.Fighter lew = new hw.hw_7.fighters.Fighter("Lew", 10, 2);
//
//                hw.hw_7.fighters.Fighter harry = new hw.hw_7.fighters.Fighter("Harry", 5, 4);
//
//                String a = kata.declareWinner(lew, harry, "Lew");
//
//                System.out.println(a);
//            }
//
//            public class Fighter {
//                public String name;
//                public int health, damagePerAttack;
//
//                public Fighter(String name, int health, int damagePerAttack) {
//                    this.name = name;
//                    this.health = health;
//                    this.damagePerAttack = damagePerAttack;
//                }
//            }
//
//            public class Kata {
//                public static String declareWinner(hw.hw_7.fighters.Fighter fighter1, hw.hw_7.fighters.Fighter fighter2, String firstAttacker) {
//                    int counter;
//                    if (fighter1.name.equals(firstAttacker)) {
//                        counter = 1;
//                    } else {
//                        counter = 2;
//                    }
//                    while (fighter1.health > 0 && fighter2.health > 0) {
//                        if (counter % 2 != 0) {
//                            fighter2.health -= fighter1.damagePerAttack;
//                        } else {
//                            fighter1.health -= fighter2.damagePerAttack;
//                        }
//                        counter++;
//                    }
//                    if (counter % 2 != 0) {
//                        return fighter2.name;
//                    } else {
//                        return fighter1.name;
//                    }
//                }
//            }
//        }

        // или можно установить порядок бойцов по другому: боец_новый 1 атакует первым и боец_новый 2 - вторым. Если имя
        // переданного бойца эквивалентно строке, то этот боец - боец_новый 1

    }

}
