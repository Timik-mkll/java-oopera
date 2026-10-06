import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void actorAdd(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в списке.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActorReplace, String surnameToReplace) {
        int indexToReplace = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                indexToReplace = i;
                break;
            }
        }
        if (indexToReplace != -1) {
            listOfActors.set(indexToReplace, newActorReplace);
        } else {
            System.out.println("Актёр с фамилией " + surnameToReplace + " отсутствует в спектакле.");
        }
    }
}
