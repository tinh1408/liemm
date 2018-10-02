import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Bài 1");
        System.out.println("Vui lòng nhập điểm Lý");
        Scanner sc = new Scanner(System.in);
        float Diem_vat_ly; // Em đặt tên biến như này là sai quy tắc rồi, em nên sửa lại như này: diemVatLy
            do{
                System.out.print("Vui lòng nhập số từ 0-10 : ");
                Diem_vat_ly = sc.nextFloat(); 
            }while ((Diem_vat_ly < 0 ) || (Diem_vat_ly >10)); // điều kiện chưa đúng em à, có trường hợp điểm =0 và = 10 nữa mà

        System.out.println("Vui lòng nhập điểm Hóa");
        float Diem_hoa_hoc;
        do{
            System.out.print("Vui lòng nhập số từ 0-10 : ");
            Diem_hoa_hoc = sc.nextFloat();
        }while ((Diem_hoa_hoc < 0 ) || (Diem_hoa_hoc >10));

        System.out.println("Vui lòng nhập điểm Sinh học");
        float Diem_sinh_hoc;
        do{
            System.out.print("Vui lòng nhập số từ 0-10 : ");
            Diem_sinh_hoc = sc.nextFloat();
        }while ((Diem_sinh_hoc < 0 ) || (Diem_sinh_hoc >10));

        float Diem_tong = Diem_vat_ly + Diem_hoa_hoc + Diem_sinh_hoc;
        float Diem_TB = Diem_tong/3;
        System.out.println("Điểm tổng là : " + Diem_tong );
        System.out.println("Điểm TB là : " + Diem_TB );

        //Bài 2
        System.out.println("Hello World! Bài 2");
        System.out.println("Vui lòng nhập Độ C");
        float Do_C;
       // Do_C = sc.nextFloat();
            do{
                System.out.println("Theo nguyên lý III nhiệt dộng lực học: không tòn lại nhiệt độ thấp hơn -273 độ C");
                System.out.print("Vui lòng nhập nhiệt độ cao hơn -273 độ C : ");
                Do_C = sc.nextFloat();
            }while (Do_C < -273 );
        float Do_F = (Do_C*9/5) + 32;
        System.out.println(Do_C + " độ C = "+ Do_F + " độ F");

        //Bài 3
        System.out.println("Hello World! Bài 3");
        System.out.println("Vui lòng nhập bán kính");
        float Ban_kinh_r ;
        do{
            System.out.print("Vui lòng nhập bán kính lớn hơn 0 :");
            Ban_kinh_r = sc.nextFloat();
        }while (Ban_kinh_r < 0 );
        float Chu_vi =  (Ban_kinh_r * 314/100);// 314/100 em nên khai báo hằng số cho nó: ví dụ: final int PI = 3,14;
        float Dien_tich = Ban_kinh_r * Ban_kinh_r *314/100;
        System.out.println("Chu vi hình tròn : " + Chu_vi);
        System.out.println("Diện tích hình tròn : " + Dien_tich);

        //Bài 4
        System.out.println("Hello World! Bài 4");
        System.out.println("Hiện tại là năm 2018");
        int Nam_sinh;
        do{

            System.out.print("Vui lòng nhập năm bé hơn 2018 :");
            Nam_sinh = sc.nextInt();
        }while (Nam_sinh > 2018 );
        int Tuoi = 2018 - Nam_sinh; // Năm sinh em nên cho nhập vào vì qua năm 2019 thì chương trình của em chạy không đúng nữa
        System.out.println("Só tuổi là : " + Tuoi);

    }
}
