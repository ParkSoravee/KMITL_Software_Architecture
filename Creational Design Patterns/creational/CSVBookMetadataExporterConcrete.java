package creational;

import java.io.IOException;
import java.util.Set;

public class CSVBookMetadataExporterConcrete implements Exporter {
    private final CSVBookMetadataFormatter formatter;

    public CSVBookMetadataExporterConcrete() throws IOException {
        this.formatter = new CSVBookMetadataFormatter();
    }

    @Override
    public String getMetadataString(Set<Book> books) {
        for (Book book : books) {
            this.formatter.append(book);
        }
        return this.formatter.getMetadataString();
    }
}
