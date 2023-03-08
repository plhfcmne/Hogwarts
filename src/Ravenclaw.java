public class Ravenclaw extends HogwartsStudents {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }














    public int ability() {
        return cleverness+wisdom+wit+creativity;
    }
    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf(
                    "%s лучший Когтевранец, чем %s: %d VS %d%n ",
                    getName(),
                    ravenclaw.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    " %s лучший Когтевранец, чем %s: %d VS %d%n ",
                    ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    " %s такой же Когтевранец, как %s: %d VS %d%n ",
                    ravenclaw.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }
    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d; творчество: %d", super.toString(),cleverness,wisdom, wit,creativity);
    }
}
