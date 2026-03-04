import java.util.Objects;

public class Actor extends Person{
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                Objects.equals(height, otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }



}
