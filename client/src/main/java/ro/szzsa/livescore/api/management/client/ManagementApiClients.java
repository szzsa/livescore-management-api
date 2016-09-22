package ro.szzsa.livescore.api.management.client;

/**
 * Factory methods for {@link ManagementApiClient} instances.
 */
public final class ManagementApiClients {

  private ManagementApiClients() {
    throw new UnsupportedOperationException();
  }

  public static ManagementApiClient createDefaultHttpClient(String serverUrl, String username, String password) {
    return new ManagementApiHttpClient(serverUrl, username, password);
  }

  public static ManagementApiHttpClientBuilder createCustomHttpClient(String serverUrl, String username, String password) {
    return new ManagementApiHttpClientBuilder(serverUrl, username, password);
  }
}
