package sample.bdd;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matcher.*;

public class Test {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Request req = new Request();
		req.setJob("IT");
		req.setName("shan");
		
		ObjectMapper obj = new ObjectMapper();
		System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		request.body(req);
		Response response = request.post("/api/users");
		System.out.println(response.asPrettyString());
		Response resp = response.as(Response.class);
		
	}

}

