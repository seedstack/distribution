package {{ project.package }}.interfaces.rest;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seedstack.seed.Configuration;
import org.seedstack.seed.testing.junit4.SeedITRunner;
import org.seedstack.seed.undertow.LaunchWithUndertow;

@RunWith(SeedITRunner.class)
@LaunchWithUndertow
public class HelloResourceIT {
    @Configuration("runtime.web.baseUrl")
    private String baseUrl;

    @Test
    public void testHelloWorld() throws Exception {
        Response response = given()
                .auth().basic("demo", "demo")
                .expect().statusCode(200)
                .when().get(baseUrl + "/hello");

        assertThat(response.body().asString()).isEqualTo("Hello World!");
    }
}
