package api;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.restassured.response.Response;
import model.Root;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class FlightTicketRequest {
    Response response;
       public List<String> flightTicketFromList(String kw) throws UnirestException, IOException {
        HttpResponse<JsonNode> response = Unirest.get("https://www.enuygun.com/ucak-bileti/trip-autocomplete/?term="+kw)
                .header("cookie", "SERVERID-SH=shwww7; SERVERID-SAG=rdwww10")
                .asJson();
        ObjectMapper mapper = new ObjectMapper();
        Root[] flightList = mapper.readValue(response.getBody().toString(), Root[].class);
            return flightList.stream()
                    .filter(f -> f.getflightList() > 30)
                    .flatMap(flightList -> flightList.getAirportList().stream())
                    .map(City::getDistrict)
                    .distinct()
                    .collect(Country.toList());
                    
                    );
        }
        return city_name_code_airport_country;
}

    public void flightTiketFromListByRest(){

        response = given()
                .header("content-type","application/json")
                .when()
                .get("https://www.enuygun.com/ucak-bileti/trip-autocomplete/?term=mer")
                .then()
                .statusCode(200)
                .extract().response();

    }
}
