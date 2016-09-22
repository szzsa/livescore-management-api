package ro.szzsa.livescore.api.management.client;

import ro.szzsa.utils.connector.Connectors;
import ro.szzsa.utils.connector.HttpConnectorBuilder;
import ro.szzsa.utils.connector.log.Logger;

/**
 *
 */
public final class ManagementApiHttpClientBuilder {

  private final String serverUrl;

  private HttpConnectorBuilder connectorBuilder;

  public ManagementApiHttpClientBuilder(String serverUrl, String username, String password) {
    this.serverUrl = serverUrl;
    connectorBuilder = Connectors.withCredentials(username, password);
  }

  public ManagementApiHttpClientBuilder setSocketTimeout(int socketTimeout) {
    connectorBuilder.setSocketTimeout(socketTimeout);
    return this;
  }

  public ManagementApiHttpClientBuilder setConnectionTimeout(int connectionTimeout) {
    connectorBuilder.setConnectionTimeout(connectionTimeout);
    return this;
  }

  public ManagementApiHttpClientBuilder setNumberOfRetries(int numberOfRetries) {
    connectorBuilder.setNumberOfRetries(numberOfRetries);
    return this;
  }

  public ManagementApiHttpClientBuilder setLogger(Logger logger) {
    connectorBuilder.setLogger(logger);
    return this;
  }

  public ManagementApiHttpClient build() {
    return new ManagementApiHttpClient(serverUrl, connectorBuilder.build());
  }
}
