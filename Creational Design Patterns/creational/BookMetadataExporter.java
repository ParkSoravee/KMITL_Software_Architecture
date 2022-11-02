package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract Exporter createExporter() throws IOException, ParserConfigurationException;

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        // Please implement this method. You may create additional methods as you see
        // fit.
        Exporter exporter = createExporter();
        stream.println(exporter.getMetadataString(this.books));
    }
}