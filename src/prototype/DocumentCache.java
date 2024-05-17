package prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentCache {
    private static Map<String, Document> documentMap = new HashMap<>();

    public static Document getDocument(String documentType) {
        Document cachedDocument = documentMap.get(documentType);
        return cachedDocument.copy();
    }

    public static void loadCache() {
        Report report = new Report();
        documentMap.put("Report", report);

        Presentation presentation = new Presentation();
        documentMap.put("Presentation", presentation);
    }
}
