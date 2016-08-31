package ro.szzsa.livescore.api.management.client.exception;

/**
 *
 */
public class ManagementApiException extends Exception {

  public ManagementApiException() {
  }

  public ManagementApiException(String detailMessage) {
    super(detailMessage);
  }

  public ManagementApiException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }

  public ManagementApiException(Throwable throwable) {
    super(throwable);
  }
}
