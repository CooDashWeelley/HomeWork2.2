
public class Hufflepuff extends Hogwarts {
    private final String faculty = "Hufflepuff";
    public int diligence;
    public int loyalty;
    public int honesty;
    PrintService printService = new PrintService();

    public Hufflepuff(String name, int magician, int transgress, int diligence, int loyalty, int honesty) {
        super(name, magician, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", faculty=" + faculty +
                ", magician=" + magician +
                ", transgress=" + transgress +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return getDiligence() == that.getDiligence() && getLoyalty() == that.getLoyalty() && getHonesty() == that.getHonesty();
    }

    public void equalsInFaculty(Hufflepuff a) {
        int totalA = a.getDiligence() + a.getHonesty() + a.getLoyalty();
        int totalB = this.getDiligence() + this.getHonesty() + this.getLoyalty();
        printService.printBetterInFaculty(a, totalA, this, totalB, faculty);
    }

}
