public class √облин extends ѕерсонаж implements Iћогу¬резать, Iћогу«аорать {
    public √облин(String им€) {
        super(им€);
    }

    @Override
    public boolean врезать(ѕерсонаж кому¬резать) {
        int случайность = (int)(Math.random()*100);
        //System.out.print( "-" + (this.getЋовкость() * 3) +" случ-" + случайность );
        //System.out.print((this.getЋовкость() * 3 > случайность) ? "" : "промах");
        кому¬резать.увеличить«доровье((this.getЋовкость() * 3 > случайность) ? -this.get—ила() : 0);
        System.out.println("гоблин " + this.get»м€() + " врезал игроку " + кому¬резать.get»м€()
                + ". " + ((this.getЋовкость() * 3 > случайность) ? "" : "промах. "));
        заорать();
        return кому¬резать.isƒохлый();
    }
    @Override
    public void заорать() {
        System.out.println(" ––¬ак––¬¬¬ааааккк–––––∆ј " );
    }
}
