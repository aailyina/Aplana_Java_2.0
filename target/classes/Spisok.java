public class Spisok {
    void Napolnenie () {
        int i,j;
        String array[][] = {
                {"ID", "Название", "Вес, г", "Цена, руб."},
                {"1", "Конфета", "100", "250"},
                {"2", "Чупа-чупс", "10", "100"},
                {"3", "Мороженое", "229", "140"},
                {"4", "Игрушка", "300", "555"},
                {"5", "Мармелад", "15", "234"},
                {"6", "Свисток", "50", "34"}
        };
        for (i = 0; i < 7; i++) { //Выводим список всех подарков
            for (j = 0; j < 4; j++)
                System.out.print(array[i][j] + "        ");
            System.out.println();
        }
    }

}
