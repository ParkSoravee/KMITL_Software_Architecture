package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    @Override
    public Exporter createExporter() throws IOException {
        return new CSVBookMetadataExporterConcrete();
    }
}
