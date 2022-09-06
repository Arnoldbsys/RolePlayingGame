import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        byte уровень = 1;
        final String[] именаМонстров = {"Саурон", "Сарумян", "Горлум", "ВижуалБэйсик", "Баралгин", "Шелли",
                "Глушитель", "Apple", "Циклоп", "Бормоглот"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дайте имя своему игроку. (проверку на неправильный ввод не делаю)");
        String имя = scanner.nextLine();
        Игрок игрок = new Игрок(имя);
        System.out.println("Здравствуйте, " + игрок.getИмя());
        System.out.println("Выберите режим игры...и начнем !!!");
        menuMain();
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("3")) break;
            else if (s.equals("1")) {
                System.out.println("К торговцу.");
                Thread th = new Thread(new Торговля(игрок, new Торговец("Пятерочка")));
                th.start();
            } else if (s.equals("2")) {
                System.out.println("В темный лес....");

                IМогуВрезать монстр = (Math.random()) > 0.5
                        ? new Гоблин(именаМонстров[(int)(Math.random() * 10)])
                        : new Скелет(именаМонстров[(int)(Math.random() * 10)]);
                if (игрок.getОпыт() > 4 && уровень == 1){
                    System.out.println();
                    System.out.println("Поздравляем, вы стали опытнее. Переходим на следующий уровень");
                    System.out.println("Монстры там сильнее и злее... Нажмите Enter для продолжения");
                    System.out.println();
                    ((Персонаж)монстр).setСила(15);  //Следующий уровень
                    уровень = 2;
                    String пауза = scanner.nextLine();
                }
                Thread th = new Thread(new Драка(игрок, монстр));
                th.start();
                if (игрок.isДохлый()){
                    System.out.println("Монстры вас одолели. Игра закончена");
                    break;
                }
            }
        }
    }
    public static void menuMain(){
        System.out.println();
        System.out.println("""
               Команды игры:
               '1' - К торговцу.
               '2' - В темный лес подраться.
               '3' - Выход.""");
        System.out.println();
    }
}
