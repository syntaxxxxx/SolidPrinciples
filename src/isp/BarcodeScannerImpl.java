package isp;

public class BarcodeScannerImpl implements BarcodeScanner {
    public void Scan(Document document) {
        System.out.println("Scan Barcode the QR Code from the document : " + document);
    }
}