public class Hufflepuff extends HogwartsStudents {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf(
                    "%s лучший Пуффендуец, чем %s: %d VS %d%n ",
                    getName(),
                    hufflepuff.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf(
                    " %s лучший Пуффендуец, чем  %s: %d VS %d%n ",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf(
                    " %s такой же пуффендуец, как и %s: %d VS %d%n ",
                    hufflepuff.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), diligence, loyalty, honesty);
    }
}
