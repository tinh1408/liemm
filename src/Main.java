import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Bài 1");
        System.out.println("Vui lòng nhập điểm Lý");
        Scanner sc = new Scanner(System.in);

        float Diem_vat_ly = sc.nextFloat();
        if ((Diem_vat_ly < 0 ) || (Diem_vat_ly >10)){
            do{
                System.out.println("Vui lòng nhập số từ 0-10 : ");
                Diem_vat_ly = sc.nextFloat();
            }while ((Diem_vat_ly < 0 ) || (Diem_vat_ly >10));
        }

        System.out.println("Vui lòng nhập điểm Hóa");
        float Diem_hoa_hoc = sc.nextFloat();
        if ((Diem_hoa_hoc < 0 ) || (Diem_hoa_hoc >10)){
        do{
            System.out.println("Vui lòng nhập số từ 0-10 : ");
            Diem_hoa_hoc = sc.nextFloat();
        }while ((Diem_hoa_hoc < 0 ) || (Diem_hoa_hoc >10));
        }

        System.out.println("Vui lòng nhập điểm Sinh học");
        float Diem_sinh_hoc = sc.nextFloat();
        if ((Diem_sinh_hoc < 0 ) || (Diem_sinh_hoc >10)){
        do{
            System.out.println("Vui lòng nhập số từ 0-10 : ");
            Diem_sinh_hoc = sc.nextFloat();
        }while ((Diem_sinh_hoc < 0 ) || (Diem_sinh_hoc >10));
        }

        float Diem_tong = Diem_vat_ly + Diem_hoa_hoc + Diem_sinh_hoc;
        float Diem_TB = Diem_tong/3;
        System.out.println("Điểm tổng là : " + Diem_tong );
        System.out.println("Điểm TB là : " + Diem_TB );

        System.out.println("Hello World! Bài 2");
    }
}
