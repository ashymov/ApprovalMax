package com.sashymov.ApprovalMax.cases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sashymov.ApprovalMax.bodies.AuthBody;
import com.sashymov.ApprovalMax.bodies.AuthResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthApiTest {

    @Test
    public String auth() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();


        AuthBody loginBody = new AuthBody();

        loginBody.setPassword("43350681");
        loginBody.setUsername("43350681");
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .body(loginBody)
                        .when()
                        .post("https://portal.kundoluk.kg//api/v1/auth/login")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response();

        String s = response.getBody().asString();
        AuthResponse authResponse = objectMapper.readValue(s, AuthResponse.class);
        return authResponse.getTokenType() + "_" + authResponse.getToken();

    }
}
