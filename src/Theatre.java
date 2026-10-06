import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actorVanya = new Actor("Ваня", "Шурин", Gender.MALE, 181.5);
        Actor actorSofa = new Actor("Софа", "Кайт", Gender.FEMALE, 169.0);
        Actor actorPixel = new Actor("Пиксель", "Котович", Gender.MALE, 175.0);

        Director directorPetr = new Director("Пётр", "Васильевич", Gender.MALE, 23);
        Director directorOleg = new Director("Олег", "Николаевич", Gender.MALE, 31);

        String musicAuthor = "Лиза";
        String choreographer = "Карина";

        ArrayList<Actor> actorsMoon = new ArrayList<>();
        ArrayList<Actor> actorsOpera = new ArrayList<>();
        ArrayList<Actor> actorsBallet = new ArrayList<>();

        Show showMoon = new Show("Луна", 78, directorPetr, actorsMoon);
        Opera showOpera = new Opera("Солнцестояние", 147, directorOleg, actorsOpera, musicAuthor,
                "Действие первое... Действие второе... Действие третье...", 7);
        Ballet showBallet = new Ballet("Звёзды", 94, directorOleg, actorsBallet, musicAuthor,
                "Действие первое... Действие второе... Действие третье... Конец!", choreographer);

        showMoon.actorAdd(actorVanya);
        showMoon.actorAdd(actorSofa);

        showOpera.actorAdd(actorPixel);
        showOpera.actorAdd(actorSofa);
        showOpera.actorAdd(actorVanya);


        showBallet.actorAdd(actorSofa);
        showBallet.actorAdd(actorPixel);

        System.out.println("\nСписок актёров спектакля 'Луна':");
        showMoon.printActors();

        System.out.println("\nСписок актёров оперы 'Солнцестояние':");
        showOpera.printActors();

        System.out.println("\nСписок актёров балета 'Звёзды': ");
        showBallet.printActors();

        System.out.println("\nЗамена актёра в спектакле 'Луна' (меняем Шурина на Пикселя)...");
        System.out.println("Новый состав спектакля 'Луна': ");
        showMoon.replaceActor(actorPixel, "Шурин");
        showMoon.printActors();

        System.out.println("\nЗаменим несуществующего актёра в опере:");
        Actor someNewActor = new Actor("Василий", "Островской", Gender.MALE, 176.5);
        showOpera.replaceActor(someNewActor, "Лебедев");


        System.out.println("\nЛибретто музыкальных спектаклей: ");
        System.out.println("Либретто оперы: " + showOpera.getLibrettoText());
        System.out.println("Либретто балета: " + showBallet.getLibrettoText());
    }
}
