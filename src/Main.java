import java.util.Random;

public class Main {
    public static int random() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }

    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("гарри поттер", random(), random(), random(), random(), random()),
                new Gryffindor("Гермиона Грейнджер", random(), random(), random(), random(), random()),
                new Gryffindor("Рон Уизли", random(), random(), random(), random(), random())
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", random(), random(), random(), random(), random(), random(), random()),
                new Slytherin("Грэхэм Монтегю", random(), random(), random(), random(), random(), random(), random()),
                new Slytherin("Грегори Гойл", random(), random(), random(), random(), random(), random(), random())};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", random(), random(), random(), random(), random()),
                new Hufflepuff("Седрик Диггори", random(), random(), random(), random(), random()),
                new Hufflepuff("Джастин Финч-Флетчли", random(), random(), random(), random(), random())
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", random(), random(), random(), random(), random(), random()),
                new Ravenclaw("Падма Патил", random(), random(), random(), random(), random(), random()),
                new Ravenclaw("Маркус Белби", random(), random(), random(), random(), random(), random())
        };

        System.out.println(gryffindors[0]);
        System.out.println(slytherins[1]);
        System.out.println(hufflepuffs[1]);
        System.out.println(hufflepuffs[2]);
        System.out.println();
        hufflepuffs[1].equalsInFaculty(hufflepuffs[2]);
        slytherins[1].equalsInHogwarts(gryffindors[0]);
        ravenclaws[2].setName("123");
        System.out.println(ravenclaws[2]);
        gryffindors[0].equalsInFaculty(gryffindors[1]);
        ravenclaws[2].equalsInFaculty(ravenclaws[0]);

    }


}