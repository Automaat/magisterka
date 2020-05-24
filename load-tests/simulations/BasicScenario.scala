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
    .baseUrl("http://localhost:8080") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn: ScenarioBuilder = scenario("Simple io benchmark")
    .exec(_.set("resourceId", UUID.randomUUID().toString))
    .exec(
      http("load resource")
        .post("/resource/${resourceId}")
        .body(StringBody("""{ "value": "some resource" }"""))
    )
    .pause(10)
    .exec(
      http("load resource")
        .get("/resource/${resourceId}")
        .check(status.is(500))
    )
    .pause(10)
    .exec(
      http("delete resource")
        .delete("/resource/${resourceId}")
    )

  setUp(scn.inject(constantUsersPerSec(10) during (15 seconds) randomized).protocols(httpProtocol))
}