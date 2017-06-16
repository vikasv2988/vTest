package com.rest.services;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.junit.Test;

/**
 * Created by vbilenko on 6/5/17.
 */

public class ServicesSmokeTest extends RestAssured {

    @Test
    public void serviceServiceTest() {

                given()
                        .baseUri("http://localhost:8081/eMusicStore/")
                        .expect().statusCode(200)
                        .log().all();

    }

}
