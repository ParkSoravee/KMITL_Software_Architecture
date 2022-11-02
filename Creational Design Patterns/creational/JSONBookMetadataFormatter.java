package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject json;
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
        // fit.
        try {
            ArrayList<String> authors = new ArrayList<String>();
            json = new JSONObject();
            json.put("ISBN", b.getISBN());
            json.put("Title", b.getTitle());
            json.put("Publisher", b.getPublisher());
            for (String author : b.getAuthors()) {
                authors.add(author);
            }
            json.put("Authors", authors);
            jsonArray.add(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return jsonArray.toJSONString();
    }
}