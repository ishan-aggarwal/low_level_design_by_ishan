package adapter.example2;

import adapter.example2.model.Flower;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonAdapter implements Adapter {

    private final Analytics adaptee;

    public JsonAdapter(Analytics analytics) {
        this.adaptee = analytics;
    }

    @Override
    public void convertAndPerformAnalysis(String xml) {

        XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper mapper = new ObjectMapper();
        Flower poppy;
        String json;

        // convert the xml to json object
        try {
            poppy = xmlMapper.readValue(xml, Flower.class);
            json = mapper.writeValueAsString(poppy);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        // calling the 3rd party library using json object
        adaptee.doAnalysis(json);
    }
}
