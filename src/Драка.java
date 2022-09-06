import static java.lang.Thread.sleep;

public class ƒрака implements Runnable {
    private »грок игрок;
    private Iћогу¬резать монстр;
    private boolean игрок”дарил = true; // монстр всегда нападает первым

    public ƒрака(»грок игрок, Iћогу¬резать монстр) {
        this.игрок = игрок;
        this.монстр = монстр;
    }

    @Override
    public void run() {
        System.out.println("ƒрака началась");
        while (true) {
            try {
                sleep(100);

                if (!игрок”дарил) {
                    if (игрок.врезать((ѕерсонаж)монстр)){
                        System.out.println(((ѕерсонаж) монстр).get»м€() + " побежден ");
                        игрок.setЋовкость(игрок.getЋовкость() + 5);
                        игрок.setќпыт(игрок.getќпыт() + 1);
                        игрок.set«олото(игрок.get«олото() + 50 + игрок.getќпыт() * 10);
                        System.out.println("—амочувствие после драки: " + (»грок)игрок);
                        break;
                    }
                }
                else {
                    if (монстр.врезать(игрок)){
                        System.out.println();
                        System.out.println("игрок побежден");
                        System.out.println("ћонстры вас одолели. »гра закончена.");
                        System.exit(0);
                    }
                }
                //System.out.println("|«доровье»грок=" + игрок.get«доровье() + "|«доровьећонстр=" + ((ѕерсонаж)монстр).get«доровье());
                игрок”дарил = !игрок”дарил;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ƒрака закончилась");

        Main.menuMain();
    }
}
