public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println(" ");
        for (int x = 10; x != 0; x--) {
            System.out.print(x + " ");
        }

        System.out.println("\n\nЗадание 2");
        int x = 1;
        int friday = 5;
        int mounth = 31;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            x++;
            friday = friday + 7;
        }


        System.out.println("\nЗадание 3");
        int currentYearMin200 = 1822;
        int currentYearMax100 = 2122;
        while (currentYearMin200 <= currentYearMax100) {
            currentYearMin200++;
            if (currentYearMin200 % 79 == 0) {
                System.out.println(currentYearMin200 + " комента");
            } else continue;
        }
    }
}