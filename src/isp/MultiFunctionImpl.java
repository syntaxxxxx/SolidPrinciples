package isp;

public class MultiFunctionImpl implements MultiFunction {

    private Printer printer;
    private BarcodeScanner barcodeScanner;

    MultiFunctionImpl(BarcodeScanner barcodeScanner, Printer printer) {
        this.printer = printer;
        this.barcodeScanner = barcodeScanner;
    }

    public void Scan(Document document) throws Exception {
        barcodeScanner.Scan(document);
    }

    public void Print(Document document) throws Exception {
        printer.Print(document);
    }
}