abstract class �������� {
    private  String ���;
    private int ���� = 10;
    private int ������ = 0;
    private int �������� = 100;
    private int �������� = 20;
    private int ���� = 1;
    private boolean ������ = false;
    public ��������(String ���){ this.���=���; }

    public String get���() { return ���; }
    public int get��������() { return ��������; }
    public int get��������() { return ��������; }
    public int get����() { return ����; }
    public int get����() { return ����; }
    public int get������() { return ������; }

    public void set����(int ����) {
        this.���� = ����;
    }

    public void set������(int ������) {
        this.������ = ������;
    }

    public void set����(int ����) {
        this.���� = ����;
    }

    public boolean is������(){ return ������; }

    public void �����������������(int ��������) {
        this.�������� += ��������;
        ������ = this.�������� <= 0;
    }

    public void set��������(int ��������) {
        this.�������� = ��������;
    }

    @Override
    public String toString() {
        return "��������{" +
                "���='" + ��� + '\'' +
                ", ��������=" + �������� +
                ", ��������=" + �������� +
                ", ����=" + ���� +
                ", ����=" + ���� +
                ", ������=" + ������ +
                ", ������=" + ������ +
                '}';
    }

}
