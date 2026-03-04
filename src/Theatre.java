public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Григорий", "Павлов", Gender.MALE, 180);
        Actor actor2 = new Actor("Ирина", "Самойлова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Валентин", "Иванов", Gender.MALE, 176);
        Director director1 = new Director("Александр", "Петров", Gender.MALE, 10);
        Director director2 = new Director("Дмитрий", "Харитонов", Gender.MALE, 3);
        String musicAuthor = "Наталия Гузина";
        String choreographer = "Тамара Цветкова";

        Show storm = new Show("Гроза", 210, director1);
        storm.addNewActor(actor1);
        storm.addNewActor(actor3);

        Ballet romeoAndJuliet = new Ballet("Ромео и Джульетта", 245, director2, musicAuthor,
                        "Это балет про Ромео и Джульетту", choreographer);
        romeoAndJuliet.addNewActor(actor2);
        romeoAndJuliet.addNewActor(actor1);

        Opera onegin = new Opera("Евгений Онегин", 170, director1, musicAuthor,
                "Написано по книге Евгений онегин", 13);
        onegin.addNewActor(actor1);
        onegin.addNewActor(actor2);
        onegin.addNewActor(actor3);

        storm.printListOfActors();
        romeoAndJuliet.printListOfActors();
        onegin.printListOfActors();

        romeoAndJuliet.changeActor(actor3, "Павлов");
        romeoAndJuliet.printListOfActors();

        storm.changeActor(actor2, "Андреев");
        storm.printListOfActors();

        romeoAndJuliet.printLibretto();
        onegin.printLibretto();





    }
}
