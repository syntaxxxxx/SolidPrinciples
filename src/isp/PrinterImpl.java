package isp;

public class PrinterImpl implements Printer {
    public void Print(Document document) {
        System.out.println("Print the text from the document : " + document);
    }
}