package com.kbhit.orangebox.storage

import com.kbhit.orangebox.api.gateway.AbstractIntegrationTest
import com.kbhit.orangebox.api.gateway.TestDataLoader
import org.springframework.beans.factory.annotation.Autowired

import static com.jayway.restassured.RestAssured.given
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath

class GetApiIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    TestDataLoader testDataLoader

    def setup() {
        testDataLoader.reloadTestData()
    }

    def "Gets api"() {
        given:
        def request = given()
                .contentType("application/json")
        when:
        def response = request.when().get("/api")

        then:
        response.then().statusCode(200);
    }

    def "Gets api - resource list"() {
        given:
        def request = given()
                .contentType("application/json")
        when:
        def response = request.when().get("/api")

        then:
        response.then().body(matchesJsonSchemaInClasspath("api.json"))
    }

}
