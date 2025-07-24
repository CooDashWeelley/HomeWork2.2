public class PrintService {
    public void printBetterInFaculty (Hogwarts a, int totalA, Hogwarts b, int totalB, String faculty) {
        if (totalA > totalB) {
            System.out.println(a.getName() + " better in " + faculty + " than " + b.getName() + " with " + totalA + " points");
        } else if (totalA < totalB) {
            System.out.println(b.getName() + " better in " + faculty + " than " + a.getName() + " with " + totalB + " points");
        } else {
            System.out.println("students in " + faculty + " equals with " + totalA + " and " + totalB + " points");
        }
    }
    public void printBetterInMagician (Hogwarts a, Hogwarts b) {
        if (a.getMagician() > b.getMagician()) {
            System.out.println(a.getName() + " better than " + b.getName() + " in magician");
        } else if (a.getMagician() < b.getMagician()) {
            System.out.println(b.getName() + " better than " + a.getName() + " in magician");
        } else {
            System.out.println(a.getName() + " equals " + b.getName() + " in magician");
        }
    }

    public void printBetterInTransgression (Hogwarts a, Hogwarts b) {
        if (a.getTransgress() > b.getTransgress()) {
            System.out.println(a.getName() + " better than " + b.getName() + " in transgression");
        } else if (a.getTransgress() < b.getTransgress()) {
            System.out.println(b.getName() + " better than " + a.getName() + " in transgression");
        } else {
            System.out.println(a.getName() + " equals " + b.getName() + " in transgression");
        }
    }
}
