import java.util.Objects;

public class Hogwarts {
    PrintService printService = new PrintService();
    public String name;
    public int magician;
    public int transgress;

    public Hogwarts(String name, int magician, int transgress) {
        this.name = name;
        this.magician = magician;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagician() {
        return magician;
    }

    public void setMagician(int magician) {
        this.magician = magician;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return getName() + " " + getMagician() + " " + getTransgress();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return getMagician() == hogwarts.getMagician() && getTransgress() == hogwarts.getTransgress() && Objects.equals(getName(), hogwarts.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    public void equalsInHogwarts(Hogwarts a) {
        printService.printBetterInMagician(this, a);
        printService.printBetterInTransgression(this, a);
    }
}
