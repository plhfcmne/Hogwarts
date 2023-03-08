public class HogwartsStudents {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }











    private int ability() {
        return magic + transgression;
    }

    public void compareHogwarts(HogwartsStudents hogwartsStudents) {
        int ability1 = ability();
        int ability2 = hogwartsStudents.ability();
        if (ability1 > ability2) {
            System.out.printf(
                    "Студент %s лучше,чем студент %s: %d VS %d%n ",
                    getName(),
                    hogwartsStudents.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "Студент %s лучше,чем студент %s: %d VS %d%n ",
                    hogwartsStudents.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "Студент %s такой же, как студент %s: %d VS %d%n ",
                    hogwartsStudents.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", name, magic, transgression);
    }
}
