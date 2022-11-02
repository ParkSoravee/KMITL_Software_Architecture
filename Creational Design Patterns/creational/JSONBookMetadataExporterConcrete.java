package creational;

import java.io.IOException;
import java.util.Set;

public class JSONBookMetadataExporterConcrete implements Exporter {
    private final JSONBookMetadataFormatter formatter;

    public JSONBookMetadataExporterConcrete() throws IOException {
        this.formatter = new JSONBookMetadataFormatter();
    }

    @Override
    public String getMetadataString(Set<Book> books) {
        for (Book book : books) {
            this.formatter.append(book);
        }
        return this.formatter.getMetadataString();
    }
}
