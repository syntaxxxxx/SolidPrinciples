package isp;

public class Main {
    public static void main(String[] args) throws Exception {
        Document document = new Document();
        document.addDocument("Offer");
        document.addDocument("Invoice");

        BarcodeScannerImpl barcodeScannerImpl = new BarcodeScannerImpl();
        barcodeScannerImpl.Scan(document);

        PrinterImpl printerImpl = new PrinterImpl();
        printerImpl.Print(document);

        MultiFunctionImpl multiFunctionImpl = new MultiFunctionImpl(barcodeScannerImpl, printerImpl);
        multiFunctionImpl.Scan(document);
        multiFunctionImpl.Print(document);
    }
}