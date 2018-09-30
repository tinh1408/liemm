import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Bài 1");
        System.out.println("Vui lòng nhập điểm Lý");
        Scanner sc = new Scanner(System.in);

        byte Diem_vat_ly = sc.nextByte();
        do{
            System.out.println("Vui lòng nhập số từ 0-10 : ");
            byte Diem_vat_ly = sc.nextByte();
        }while ((Diem_vat_ly < 0 ) || (Diem_vat_ly >10));

        byte Diem_hoa_hoc = sc.nextByte();
        do{
            System.out.println("Vui lòng nhập số từ 0-10 : ");
            byte Diem_hoa_hoc = sc.nextByte();
        }while ((Diem_hoa_hoc < 0 ) || (Diem_hoa_hoc >10));

        byte Diem_sinh_hoc = sc.nextByte();
        do{
            System.out.println("Vui lòng nhập số từ 0-10 : ");
            byte Diem_sinh_hoc = sc.nextByte();
        }while ((Diem_sinh_hoc < 0 ) || (Diem_sinh_hoc >10));

        byte Diem_tong = Diem_vat_ly+ Diem_hoa_hoc + Diem_sinh_hoc;
        byte Diem_TB = Diem_tong/3;
        System.out.println("Điểm tổng là : " + Diem_tong );
        System.out.println("Điểm TB là : " + Diem_TB );
    }
}
