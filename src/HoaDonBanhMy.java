
import java.time.LocalDate;

public class HoaDonBanhMy {
    private String maHoaDon;
    private LocalDate ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiKhach;
    private int soLuongBanhCanGiao;
    private double giaBanMotChiec;
    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienPhaiThanhToan;

    // Constructor
    public HoaDonBanhMy(String maHoaDon, LocalDate ngayLapHoaDon, String tenKhachHang, String diaChiKhach, int soLuongBanhCanGiao, double giaBanMotChiec) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhach = diaChiKhach;
        this.soLuongBanhCanGiao = soLuongBanhCanGiao;
        this.giaBanMotChiec = giaBanMotChiec;
        this.tinhTienKm();
        this.tongTienPhaiThanhToan = this.tongTienHang - this.tienKhuyenMai;
    }

    // Phương thức tính tiền khuyến mãi
    private void tinhTienKm() {
        this.tongTienHang = this.soLuongBanhCanGiao * this.giaBanMotChiec;
        if (this.soLuongBanhCanGiao >= 100) {
            this.tienKhuyenMai = this.tongTienHang * 0.2; // Giảm 20% tổng hóa đơn
        } else if (this.soLuongBanhCanGiao >= 10) {
            this.tienKhuyenMai = this.tongTienHang * 0.1; // Giảm 10% mỗi chiếc bánh
        } else {
            this.tienKhuyenMai = 0;
        }
    }

    // Getter and Setter methods
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChiKhach() {
        return diaChiKhach;
    }

    public void setDiaChiKhach(String diaChiKhach) {
        this.diaChiKhach = diaChiKhach;
    }

    public int getSoLuongBanhCanGiao() {
        return soLuongBanhCanGiao;
    }

    public void setSoLuongBanhCanGiao(int soLuongBanhCanGiao) {
        this.soLuongBanhCanGiao = soLuongBanhCanGiao;
    }

    public double getGiaBanMotChiec() {
        return giaBanMotChiec;
    }

    public void setGiaBanMotChiec(double giaBanMotChiec) {
        this.giaBanMotChiec = giaBanMotChiec;
    }

    public double getTongTienHang() {
        return tongTienHang;
    }

    public double getTienKhuyenMai() {
        return tienKhuyenMai;
    }

    public double getTongTienPhaiThanhToan() {
        return tongTienPhaiThanhToan;
    }

    @Override
    public String toString() {
        return "HoaDonBanhMy{" +
                "Mã hóa đơn = '" + maHoaDon + '\'' +
                ", Ngày = " + ngayLapHoaDon +
                ", Tên khách hàng = '" + tenKhachHang + '\'' +
                ", Địa chỉ = '" + diaChiKhach + '\'' +
                ", Số lượng bánh cần giao = " + soLuongBanhCanGiao +
                ", Giá 1 bánh = " + giaBanMotChiec +
                ", Tổng tiền = " + tongTienHang +
                ", Tiền khuyến mại = " + tienKhuyenMai +
                ", Tổng tiền phải thanh toán = " + tongTienPhaiThanhToan +
                '}';
    }
}
