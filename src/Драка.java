import static java.lang.Thread.sleep;

public class ����� implements Runnable {
    private ����� �����;
    private I����������� ������;
    private boolean ����������� = true; // ������ ������ �������� ������

    public �����(����� �����, I����������� ������) {
        this.����� = �����;
        this.������ = ������;
    }

    @Override
    public void run() {
        System.out.println("����� ��������");
        while (true) {
            try {
                sleep(100);

                if (!�����������) {
                    if (�����.�������((��������)������)){
                        System.out.println(((��������) ������).get���() + " �������� ");
                        �����.set��������(�����.get��������() + 5);
                        �����.set����(�����.get����() + 1);
                        �����.set������(�����.get������() + 50 + �����.get����() * 10);
                        System.out.println("������������ ����� �����: " + (�����)�����);
                        break;
                    }
                }
                else {
                    if (������.�������(�����)){
                        System.out.println();
                        System.out.println("����� ��������");
                        System.out.println("������� ��� �������. ���� ���������.");
                        System.exit(0);
                    }
                }
                //System.out.println("|�������������=" + �����.get��������() + "|��������������=" + ((��������)������).get��������());
                ����������� = !�����������;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("����� �����������");

        Main.menuMain();
    }
}
