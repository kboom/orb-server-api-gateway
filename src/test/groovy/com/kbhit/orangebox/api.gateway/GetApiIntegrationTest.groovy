package com.kbhit.orangebox.storage

import com.kbhit.orangebox.api.gateway.AbstractIntegrationTest
import com.kbhit.orangebox.api.gateway.TestDataLoader
import org.springframework.beans.factory.annotation.Autowired

import static com.jayway.restassured.RestAssured.given


class GetApiIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    TestDataLoader testDataLoader

    def "Gets api from the database"() {
        given:
        testDataLoader.loadTestData()
        def request = given()
                .contentType("application/json")
        when:
        def response = request.when().get("/api")

        then:
        response.then().statusCode(200);
    }

}
