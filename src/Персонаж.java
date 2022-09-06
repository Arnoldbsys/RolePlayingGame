abstract class Персонаж {
    private  String имя;
    private int сила = 10;
    private int золото = 0;
    private int здоровье = 100;
    private int ловкость = 20;
    private int опыт = 1;
    private boolean дохлый = false;
    public Персонаж(String имя){ this.имя=имя; }

    public String getИмя() { return имя; }
    public int getЗдоровье() { return здоровье; }
    public int getЛовкость() { return ловкость; }
    public int getОпыт() { return опыт; }
    public int getСила() { return сила; }
    public int getЗолото() { return золото; }

    public void setСила(int сила) {
        this.сила = сила;
    }

    public void setЗолото(int золото) {
        this.золото = золото;
    }

    public void setОпыт(int опыт) {
        this.опыт = опыт;
    }

    public boolean isДохлый(){ return дохлый; }

    public void увеличитьЗдоровье(int здоровье) {
        this.здоровье += здоровье;
        дохлый = this.здоровье <= 0;
    }

    public void setЛовкость(int ловкость) {
        this.ловкость = ловкость;
    }

    @Override
    public String toString() {
        return "Персонаж{" +
                "имя='" + имя + '\'' +
                ", здоровье=" + здоровье +
                ", ловкость=" + ловкость +
                ", опыт=" + опыт +
                ", сила=" + сила +
                ", золото=" + золото +
                ", дохлый=" + дохлый +
                '}';
    }

}
