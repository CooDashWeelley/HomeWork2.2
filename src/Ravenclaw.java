
public class Ravenclaw extends Hogwarts {
    private final String faculty = "Ravenclaw";
    public int smart;
    public int wisdom;
    public int wit;
    public int creation;
    PrintService printService = new PrintService();

    public Ravenclaw(String name, int magician, int transgress, int smart, int wisdom, int wit, int creation) {
        super(name, magician, transgress);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", faculty=" + faculty +
                ", magician=" + magician +
                ", transgress=" + transgress +
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return getSmart() == ravenclaw.getSmart() && getWisdom() == ravenclaw.getWisdom() && getWit() == ravenclaw.getWit() && getCreation() == ravenclaw.getCreation();
    }

    public void equalsInFaculty(Ravenclaw a) {
        int totalA = a.getCreation() + a.getSmart() + a.getWit() + a.getWisdom();
        int totalB = this.getCreation() + this.getSmart() + this.getWit() + this.getWisdom();
        printService.printBetterInFaculty(a, totalA, this, totalB, faculty);
    }

}
