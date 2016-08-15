package com.kbhit.orangebox.storage

import com.kbhit.orangebox.api.gateway.AbstractIntegrationTest

import static com.jayway.restassured.RestAssured.given


class GetApiIntegrationTest extends AbstractIntegrationTest {

    def "Gets api from the database"() {
        given:
        def request = given()
                .contentType("application/json")
        when:
        def response = request.when().get("/api")

        then:
        response.then().statusCode(200);
    }

}
