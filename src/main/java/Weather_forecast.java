import data.HttpGet;

import org.codehaus.jackson.map.ObjectMapper;

public class Weather_forecast {
    public static void main(String[] args) throws Exception {
        HttpGet query1 = new HttpGet("Gdynia");
        System.out.println(query1.response());
        //ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.readValue(query1.response(),???);
    }
}
