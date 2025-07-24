public class PrintService {
    public void printBetterInFaculty (Hogwarts a, int totalA, Hogwarts b, int totalB, String faculty) {
        if (totalA > totalB) {
            System.out.println(a.getName() + " better in " + faculty + " than " + b.getName() + " with " + totalA + " points");
        } else if (totalA < totalB) {
            System.out.println(b.getName() + " better in Gryffindor than " + a.getName() + " with " + totalB + " points");
        } else {
            System.out.println("students in Gryffindor equals with " + totalA + " and " + totalB + " points");
        }
    }
}
