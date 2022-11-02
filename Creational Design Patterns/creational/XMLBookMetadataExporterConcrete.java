package creational;

import javax.xml.parsers.ParserConfigurationException;

import java.util.Set;

public class XMLBookMetadataExporterConcrete implements Exporter {
    private final XMLBookMetadataFormatter formatter;

    public XMLBookMetadataExporterConcrete() throws ParserConfigurationException {
        this.formatter = new XMLBookMetadataFormatter();
    }

    @Override
    public String getMetadataString(Set<Book> books) {
        for (Book book : books) {
            this.formatter.append(book);
        }
        return this.formatter.getMetadataString();
    }
}
