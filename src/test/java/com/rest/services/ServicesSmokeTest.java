package com.rest.services;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.junit.Test;

/**
 * Created by vbilenko on 6/5/17.
 */

public class ServicesSmokeTest extends RestAssured {

    @Test
    public void serviceServiceTest() {

                given().when()
                        .contentType("application/json")
                        .get("http://localhost:8081/eMusicStore/product/productList/")
                        .then().statusCode(200)
                        .log().ifStatusCodeIsEqualTo(200);

    }

}
