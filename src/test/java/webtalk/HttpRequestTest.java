package webtalk;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class HttpRequestTest {

  @Test
  public void testBuilder() {
    HttpRequest.Builder builder = new HttpRequest.Builder().path("/home");
    assertNotNull(builder);
  }
  
}
