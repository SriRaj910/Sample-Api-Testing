import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleTest {
    @Test
    public void shouldGetAllUsers()
    {
        given()
                .when()
                    .get( "https://gorest.co.in/public/v2/users")
                .then()
                    .statusCode(200)
                    .log().body();




    }

    @Test
    public void shouldCreateUsers()
    {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 92d624d4b09559bc146b2926abccdc10cd42ef32460bcf51e51091b5bce762a1")
                .body("{\n" +
                        "  \"name\": \"Tenali Ramakrishna\",\n" +
                        "  \"gender\": \"male\",\n" +
                        "  \"email\": \"tenali.ramakrishna1@15ce.com\",\n" +
                        "  \"status\": \"active\"\n" +
                        "}")
                .when()
                    .post("https://gorest.co.in/public/v2/users")
                .then()
                    .log().body();

    }
}
