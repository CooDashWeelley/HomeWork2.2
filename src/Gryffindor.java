
public class Gryffindor extends Hogwarts {
    private final String faculty = "Gryffindor";
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magician, int transgress, int nobility, int honor, int courage) {
        super(name, magician, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", faculty= " + faculty +
                ", magician=" + magician +
                ", transgress=" + transgress +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return getNobility() == that.getNobility() && getHonor() == that.getHonor() && getCourage() == that.getCourage();
    }

    public void equalsInFaculty(Gryffindor a) {
        int totalA = a.getCourage() + a.getNobility() + a.getHonor();
        int totalB = this.getCourage() + this.getNobility() + this.getHonor();
        printService.printBetterInFaculty(a, totalA, this, totalB, faculty);

    }
}

