package data;

import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class HttpGet {
    private final String host = "http://api.openweathermap.org/data/2.5/weather?q=";

    public HttpGet(String cityName) {
        this.cityName = cityName;
    }

    private String cityName;
    private final String appid = "60c0f58947c73b7e85c6ba3310a93352";


    public  JsonNode response(){
        return Unirest.get(host+cityName+"&appid="+appid+"&units=metric&lang=pl").asJson().getBody();
    }
}
