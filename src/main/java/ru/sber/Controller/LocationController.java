package ru.sber.Controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/payment")
@RestController
public class LocationController {

    @PostMapping
    public String addXML(@RequestBody String xmlText) {
        JSONObject xmlJSONObj = XML.toJSONObject(xmlText);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = xmlJSONObj.toString();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(str);
        String prettyJson = gson.toJson(xmlJSONObj);
        return prettyJson;
    }


}
