public class ����� extends �������� implements I����������� {
    public �����(String ���) {
        super(���);
    }

    @Override
    public boolean �������(�������� �����������) {
        int ����������� = (int)(Math.random()*100);
        int ��������� = (����������� < 20 ? this.get����() * 2 : this.get����()); // � ������������ 20% ���� ����� �����������
        //System.out.print( "-" + (this.get��������() * 3) +" ����-" + ����������� );
        //System.out.print((this.get��������() * 3 > �����������) ? "" : "������");
        �����������.�����������������((this.get��������() * 3 > �����������) ? -��������� : 0);
        System.out.println("����� " + this.get���() + " ������ " + ((����������� < 20) ? "������ " : "")
                + �����������.getClass().getSimpleName().toLowerCase() + "� " + �����������.get���()
                + ". " + ((this.get��������() * 3 > �����������) ? "" : "������. "));
        return �����������.is������();

    }
}
