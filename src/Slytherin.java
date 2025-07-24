
public class Slytherin extends Hogwarts {
    private final String faculty = "Slytherin";
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int thirstForPower;
    PrintService printService = new PrintService();

    public Slytherin(String name, int magician, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magician, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", faculty=" + faculty +
                ", magician=" + magician +
                ", transgress=" + transgress +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return getCunning() == slytherin.getCunning() && getDetermination() == slytherin.getDetermination() && getAmbition() == slytherin.getAmbition() && getResourcefulness() == slytherin.getResourcefulness() && getThirstForPower() == slytherin.getThirstForPower();
    }

    public void equalsInFaculty(Slytherin a) {
        int totalA = a.getAmbition() + a.getCunning() + a.getDetermination() + a.getResourcefulness() + a.getThirstForPower();
        int totalB = this.getAmbition() + this.getCunning() + this.getDetermination() + this.getResourcefulness() + this.getThirstForPower();
        printService.printBetterInFaculty(a, totalA, this, totalB, faculty);
    }

}
