public class »грок extends ѕерсонаж implements Iћогу¬резать {
    public »грок(String им€) {
        super(им€);
    }

    @Override
    public boolean врезать(ѕерсонаж кому¬резать) {
        int случайность = (int)(Math.random()*100);
        int сила”дара = (случайность < 20 ? this.get—ила() * 2 : this.get—ила()); // — веро€тностью 20% сила удара удваиваетс€
        //System.out.print( "-" + (this.getЋовкость() * 3) +" случ-" + случайность );
        //System.out.print((this.getЋовкость() * 3 > случайность) ? "" : "промах");
        кому¬резать.увеличить«доровье((this.getЋовкость() * 3 > случайность) ? -сила”дара : 0);
        System.out.println("игрок " + this.get»м€() + " врезал " + ((случайность < 20) ? "сильно " : "")
                + кому¬резать.getClass().getSimpleName().toLowerCase() + "у " + кому¬резать.get»м€()
                + ". " + ((this.getЋовкость() * 3 > случайность) ? "" : "промах. "));
        return кому¬резать.isƒохлый();

    }
}
