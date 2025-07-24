import java.util.Objects;

public class Hogwarts {

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
        if (this.getMagician() > a.getMagician()) {
            System.out.println(this.getName() + " better than " + a.getName() + " in magician");
        } else if (this.getMagician() < a.getMagician()) {
            System.out.println(a.getName() + " better than " + this.getName() + " in magician");
        } else {
            System.out.println(this.getName() + " equals " + a.getName() + " in magician");
        }
        if (this.getTransgress() > a.getTransgress()) {
            System.out.println(this.getName() + " better than " + a.getName() + " in transgression");
        } else if (this.getTransgress() < a.getTransgress()) {
            System.out.println(a.getName() + " better than " + this.getName() + " in transgression");
        } else {
            System.out.println(this.getName() + " equals " + a.getName() + " in transgression");
        }
    }
}
