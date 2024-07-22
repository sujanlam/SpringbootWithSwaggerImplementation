1) Add this dependency:
   <dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.6.0</version>
		</dependency>
		<dependency>
3) @Hidden => on methods on controller use this annotation if you want to hide those on Swagger API
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
4) To make sure that authorization is needed to access that endpoint on swagger.
For globally (all controllers)
====================================
@SecurityScheme(
        name = "authBearer",
        in = SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme="bearer",
        description = "Security Description")
public class OpenAPIConfig {
}
---------------------------------
For one controller:
==============================
On the controller:
------------------------------
@RestController
@SecurityRequirement(name = "auth")
@Tag(name = "My API", description = "API for managing data")
public class DataController {

    @GetMapping("/getData")
--------------------------------------------------------------------------------------------------------------
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
