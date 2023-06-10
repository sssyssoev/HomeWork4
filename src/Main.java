
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        System.out.println("Printout for HomeWork 4 finished");


    }

    public static void task1() {
        int personAge1 = 15;
        int personAge2 = 19;

        System.out.println("Задача №1");

        if (personAge1 >= 18) {
            System.out.println("Если возраст человека равен " + personAge1 + " или более лет, то он совершеннолетний");
        } else if (personAge1 < 18) {
            System.out.println("Если возраст человека менее " + personAge1 + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }

        if (personAge2 >= 18) {
            System.out.println("Если возраст человека равен " + personAge2 + " или более лет, то он совершеннолетний");
        } else if (personAge1 < 18) {
            System.out.println("Если возраст человека менее " + personAge2 + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        int ambientTemp1 = 4;
        int ambientTemp2 = 8;

        System.out.println("         ");
        System.out.println("Задача №2");

        System.out.println("Пример для 1-ой температуры");
        if (ambientTemp1 < 5) {
            System.out.println("На улице холодно, температура = " + ambientTemp1 + " нужно надеть шапку");
        } else if (ambientTemp1 >= 5) {
            System.out.println("На улице тепло, температура = " + ambientTemp1 + " можно идти без шапки");
        }

        System.out.println("Пример для 2-ой температуры");

        if (ambientTemp2 < 5) {
            System.out.println("На улице холодно, температура = " + ambientTemp2 + " нужно надеть шапку");
        } else if (ambientTemp2 >= 5) {
            System.out.println("На улице тепло, температура = " + ambientTemp2 + " можно идти без шапки");
        }
    }

    public static void task3() {
        int speed1 = 57;
        int speed2 = 62;

        System.out.println("         ");
        System.out.println("Задача №3");

        System.out.println("Пример для 1-ого значения скорости ");
        if (speed1 <= 60) {
            System.out.println("Если скорость = " + speed1 + " ,то можно ездить спокойно");
        } else if (speed1 > 60) {
            System.out.println("Если скорость  = " + speed1 + " , то придется заплатить штраф");
        }

        System.out.println("Пример для 2-ой скорости");

        if (speed2 <= 60) {
            System.out.println("Если скорость = " + speed2 + " ,то можно ездить спокойно");
        } else if (speed2 > 60) {
            System.out.println("Если скорость  = " + speed2 + " , то придется заплатить штраф");
        }
    }

    public static void task4() {

        int personAge = 59;

        System.out.println("                    ");
        System.out.println(" Задача №4  ");

        if (personAge < 2) {
            System.out.println("Если возраст человека менее " + personAge + " , то ему пора спать");
        }
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека " + personAge + " , то ему нужно ходить в детский сад");
        }
        if (personAge >= 7 && personAge <= 18) {
            System.out.println("Если возраст человека " + personAge + ", то ему нужно ходить в школу");
        }
        if (personAge > 18 && personAge < 24) {
            System.out.println("Если возраст человека " + personAge + ", то его место в университете");
        }
        if (personAge > 24 && personAge <= 60) {
            System.out.println("Если возраст человека " + personAge + ", то ему пора ходить на работу");
        }
        if (personAge > 60) {
            System.out.println("Если возраст человека " + personAge + " , то он может отдохнуть");
        }
    }
     public static void task5() {

            int kidAge = 5;

            System.out.println("                    ");
            System.out.println(" Задача №5  ");

            if (kidAge < 5) {
                System.out.println("Если возраст ребенка  " + kidAge   + " , то ему нельзя кататься на аттракционе");
            }
            if (kidAge >= 5 && kidAge <= 14) {
                System.out.println("Если возраст ребенка " + kidAge + " , то ему нельзя кататься на аттракционе без сопровождения взрослых");
            }
            if (kidAge > 14 ) {
                System.out.println("Если возраст ребенка  "  + kidAge + ", то он может кататься на аттракционе без сопровождения взрослых");
            }

    }
    public static void task6() {

        int vanCapacity = 102;
        int ticketWithSeat = 60;
        int ticketWithoutSeat = vanCapacity - ticketWithSeat;
        int soldTicketsQuantity = 100;
        int vacantTickets = vanCapacity - soldTicketsQuantity;
        int vacantTicketsToSeat;
        int vacantTicketsWithoutSeat;

        System.out.println("                    ");
        System.out.println(" Задача №6  ");

        if (vacantTickets > 0) {
            System.out.println(" В вагоне " + vacantTickets + " свободных мест");
        }
        // Принимаем, что первыми заполняются сидячие места
        if (soldTicketsQuantity < ticketWithSeat) {
            vacantTicketsToSeat = 60 - soldTicketsQuantity;
            System.out.println("Занято " + soldTicketsQuantity + " сидячих мест . Свободно " + vacantTicketsToSeat + " сидячих мест и все стоячие места ");

        } else if (soldTicketsQuantity > ticketWithSeat) {
            vacantTicketsWithoutSeat = vanCapacity - soldTicketsQuantity;
            System.out.println("Заняты все сидячие места . Свободно " + vacantTicketsWithoutSeat + " стоячих мест ");

        }
    }
    public static void task7() {
        int one=10;
        int two=20;
        int three=30;

        boolean largestIs1 = false;
        boolean largestIs2 = false;
        boolean largestIs3 = false;



        System.out.println("                    ");
        System.out.println(" Задача №7  ");
        if( one > two && one > three) {
       largestIs1=true;
        System.out.println("one  больше всех остальных");}
        else if (two > one && two >three)
       {largestIs2=true;
       System.out.println("Two больше всех остальных");}
        else if (three >one && three> two) {
            largestIs3=true;
        System.out.println("Three больше всех остальных");
            System.out.println("Вторая попытка первого коммита");
        }

        }
    }



