public class ������ extends �������� implements I�����������, I����������� {
    public ������(String ���) {
        super(���);
    }

    @Override
    public boolean �������(�������� �����������) {
        int ����������� = (int)(Math.random()*100);
        //System.out.print( "-" + (this.get��������() * 3) +" ����-" + ����������� );
        //System.out.print((this.get��������() * 3 > �����������) ? "" : "������");
        �����������.�����������������((this.get��������() * 3 > �����������) ? -this.get����() : 0);
        System.out.println("������ " + this.get���() + " ������ ������ " + �����������.get���()
                + ". " + ((this.get��������() * 3 > �����������) ? "" : "������. "));
        �������();
        return �����������.is������();
    }
    @Override
    public void �������() {
        System.out.println(" �������������������������" );
    }
}
