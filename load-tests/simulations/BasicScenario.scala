package benchamark_load_tests

import java.util.UUID

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration._
import scala.language.postfixOps

class BasicScenario extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://51.210.97.142:8080") // Here is the root for all relative URLs
    .acceptHeader("application/json") // Here are the common headers
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn: ScenarioBuilder = scenario("Simple io benchmark")
    .exec(_.set("resourceId", UUID.randomUUID().toString))
    .exec(
      http("create resource")
        .post("/resource/${resourceId}")
        .body(StringBody("""{ "value": "some resource" }"""))
        .header(HttpHeaderNames.ContentType, HttpHeaderValues.ApplicationJson)
    )
    .pause(10)
    .exec(
      http("load resource")
        .get("/resource/${resourceId}")
    )
    .pause(5)
    .exec(
      http("load resource")
        .get("/resource/${resourceId}")
    )
    .pause(5)
    .exec(
      http("load resource")
        .get("/resource/${resourceId}")
    )
    .pause(5)
    .exec(
      http("load resource")
        .get("/resource/${resourceId}")
    )
    .pause(10)
    .exec(
      http("delete resource")
        .delete("/resource/${resourceId}")
    )

  setUp(scn.inject(constantUsersPerSec(80) during (1200 seconds)).protocols(httpProtocol))
}