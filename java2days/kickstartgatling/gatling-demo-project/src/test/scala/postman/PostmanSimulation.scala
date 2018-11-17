package postman

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class PostmanSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://postman-echo.com")
    .acceptHeader("text/html,application/xhtml+xml,;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Gatling/3.0.0")

  val scn = scenario("Postman")
    .exec(http("GET")
      .get("/get?msg=Hello%20World")
      .check(bodyBytes.transform(_.length > 200).is(true))
    )
    .exec(http("POST")
      .post("/post")
      .formParam("""foo""", """bar""")
      .check(status in(200, 201))
      .check(bodyBytes.exists)
    )

  setUp(
    scn.inject(atOnceUsers(1)).protocols(httpProtocol)
  )
}
