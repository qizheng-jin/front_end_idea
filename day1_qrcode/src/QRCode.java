import qr.CreateQR;

public class QRCode {
    public static void main(String[] args) {
        String url = "http://baidu.com";
        String filename = "day1_qrcode/QRCode.png";
        CreateQR.make(120, 120, url, filename);
    }
}
