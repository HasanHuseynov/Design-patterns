package prototype;
public class PrototypePatternDemo {
    public static void main(String[] args) {
        DocumentCache.loadCache();

        Document copiedReport = DocumentCache.getDocument("Report");
        System.out.println("Document : " + copiedReport.getClass().getSimpleName());
        copiedReport.print();

        Document copiedPresentation = DocumentCache.getDocument("Presentation");
        System.out.println("Document : " + copiedPresentation.getClass().getSimpleName());
        copiedPresentation.print();
    }
}