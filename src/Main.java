import java.util.Random;
public class Main {
    private static final Random RANDOM = new Random();

    private static Griffindor generateGriffindorStudent(String name) {
        return new Griffindor(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Slytherin generateSlytherinStudent(String name) {
        return new Slytherin(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }

    private static Hufflepuff generateHufflpuffStudent(String name) {
        return new Hufflepuff(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }

    public static void main(String[] args) {
        Griffindor harry = generateGriffindorStudent("Гарри Поттер");
        Griffindor germiona = generateGriffindorStudent("Гермиона Грейнджер");
        Griffindor ron = generateGriffindorStudent("Рон Уизли");
        Ravenclaw chan = generateRavenclawStudent("Чжоу Чанг");
        Ravenclaw padma = generateRavenclawStudent("Падма Патил");
        Ravenclaw marcus = generateRavenclawStudent("Маркус Белби");
        Slytherin draco = generateSlytherinStudent("Драко Малфой");
        Slytherin grahem = generateSlytherinStudent("Грэхэм Монтегю");
        Slytherin gregory = generateSlytherinStudent("Грегори Гойл");
        Hufflepuff zahar = generateHufflpuffStudent("Захария Смит");
        Hufflepuff sederic = generateHufflpuffStudent("Седрик Диггори");
        Hufflepuff biber = generateHufflpuffStudent("Джастин Финч-Флетчли");

        harry.print();
        germiona.print();
        ron.print();
        chan.print();
        padma.print();
        marcus.print();
        draco.print();
        grahem.print();
        gregory.print();
        zahar.print();
        sederic.print();
        biber.print();

        System.out.println();
        System.out.println("Сравниваем студентов внутри факультетов: ");
        harry.compareGriffindor(germiona);
        harry.compareGriffindor(ron);
        ron.compareGriffindor(germiona);

        chan.compareRavenclaw(padma);
        chan.compareRavenclaw(marcus);
        padma.compareRavenclaw(marcus);

        draco.compareSlytherin(grahem);
        draco.compareSlytherin(gregory);
        grahem.compareSlytherin(gregory);

        zahar.compareHufflepuff(sederic);
        zahar.compareHufflepuff(biber);
        sederic.compareHufflepuff(biber);

        System.out.println();
        System.out.println("Сравниваем студентов в Хогвардсе ");
        harry.compareHogwarts(draco);
        harry.compareHogwarts(zahar);
        harry.compareHogwarts(padma);


    }
}
