package webtalk;

public class HttpRequest extends HttpMessage {

  public static class Builder {
    private String path;
    public Builder path(String path) {
      this.path = path;
      return this;
    }
  }

  private final String path;
    
  public HttpRequest(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }
 
}
