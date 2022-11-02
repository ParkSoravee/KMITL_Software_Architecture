package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public Exporter createExporter() throws IOException {
        return new JSONBookMetadataExporterConcrete();
    }
}
