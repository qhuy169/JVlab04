
import java.time.LocalDate;
import java.util.Scanner;

public class QuanLyHoaDon {

    // Phương thức nhập thông tin hóa đơn
    public static HoaDonBanhMy nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();

        System.out.print("Nhập ngày lập hóa đơn (yyyy-mm-dd): ");
        LocalDate ngayLapHoaDon = LocalDate.parse(scanner.nextLine());

        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhập địa chỉ khách: ");
        String diaChiKhach = scanner.nextLine();

        System.out.print("Nhập số lượng bánh cần giao: ");
        int soLuongBanhCanGiao = scanner.nextInt();

        System.out.print("Nhập giá bán 1 chiếc bánh: ");
        double giaBanMotChiec = scanner.nextDouble();

        HoaDonBanhMy hoaDon = new HoaDonBanhMy(maHoaDon, ngayLapHoaDon, tenKhachHang, diaChiKhach, soLuongBanhCanGiao, giaBanMotChiec);

        return hoaDon;
    }

    // Phương thức in hóa đơn
    public static void in(HoaDonBanhMy hoaDon) {
        System.out.println(hoaDon);
    }

    // Phương thức main để kiểm tra chương trình
    public static void main(String[] args) {
        HoaDonBanhMy hoaDon = nhap();
        in(hoaDon);
    }
}
