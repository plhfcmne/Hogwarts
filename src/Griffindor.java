public class Griffindor extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGriffindor(Griffindor griffindor) {
        int ability1 = ability();
        int ability2 = griffindor.ability();
        if (ability1 > ability2) {
            System.out.printf(
                    " %s лучший Гриффиндорец,чем  %s: %d VS %d%n ",
                    getName(),
                    griffindor.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    "%s лучший Гриффиндорец,чем  %s: %d VS %d%n ",
                    griffindor.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    "С %s такой же Гриффиндорец, как и  %s: %d VS %d%n ",
                    griffindor.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, bravery);
    }
}
