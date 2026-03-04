
import java.util.ArrayList;

public class Show {
    private final String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void printDirector() {
        System.out.println(director.getName() + " " + director.getSurname());
    }

    public void printListOfActors() {
        System.out.println(title);
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }

    public void addNewActor(Actor actor) {
        if (actor == null) {
            System.out.println("Информация об актере указана некорректно.");
        } else if (listOfActors.contains(actor)) {
            System.out.println("Этот актёр уже находится в списке. Попробуйте указать другого актера.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.toString() + " был добавлен в список участников.");

        }
    }

    public void changeActor(Actor newActor, String surnameToReplace) {
        int actorIndex = -1;
        for (Actor actor: listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)) {
                actorIndex = listOfActors.indexOf(actor);
            }
        }
            if (actorIndex >= 0) {
                listOfActors.set(actorIndex, newActor);
                System.out.println(surnameToReplace + " был заменен на " + newActor.toString());
            } else {
                System.out.println("Указанный актер в списке отсутствует");
            }

    }





}
