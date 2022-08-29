package restAssuredAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class Basics 
{
	
public static void main(String[] args)
{
	RestAssured.baseURI= "https://rahulshettyacademy.com";
	String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
	.body(payload.Addplace()).when().post("maps/api/place/add/json")
	.then().statusCode(200).body("scope", equalTo("APP"))
	.header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
 System.out.println(response);
   
// JsonPath js=JsonPath (response);
 
}
}
