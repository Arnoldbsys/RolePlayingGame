import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        byte ������� = 1;
        final String[] ������������� = {"������", "�������", "������", "������������", "��������", "�����",
                "���������", "Apple", "������", "���������"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ��� ������ ������. (�������� �� ������������ ���� �� �����)");
        String ��� = scanner.nextLine();
        ����� ����� = new �����(���);
        System.out.println("������������, " + �����.get���());
        System.out.println("�������� ����� ����...� ������ !!!");
        menuMain();
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("3")) break;
            else if (s.equals("1")) {
                System.out.println("� ��������.");
                Thread th = new Thread(new ��������(�����, new ��������("���������")));
                th.start();
            } else if (s.equals("2")) {
                System.out.println("� ������ ���....");

                I����������� ������ = (Math.random()) > 0.5
                        ? new ������(�������������[(int)(Math.random() * 10)])
                        : new ������(�������������[(int)(Math.random() * 10)]);
                if (�����.get����() > 4 && ������� == 1){
                    System.out.println();
                    System.out.println("�����������, �� ����� �������. ��������� �� ��������� �������");
                    System.out.println("������� ��� ������� � ����... ������� Enter ��� �����������");
                    System.out.println();
                    ((��������)������).set����(15);  //��������� �������
                    ������� = 2;
                    String ����� = scanner.nextLine();
                }
                Thread th = new Thread(new �����(�����, ������));
                th.start();
                if (�����.is������()){
                    System.out.println("������� ��� �������. ���� ���������");
                    break;
                }
            }
        }
    }
    public static void menuMain(){
        System.out.println();
        System.out.println("""
               ������� ����:
               '1' - � ��������.
               '2' - � ������ ��� ���������.
               '3' - �����.""");
        System.out.println();
    }
}
