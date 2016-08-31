package ro.szzsa.livescore.api.management.protocol;

import ro.szzsa.livescore.api.management.protocol.request.GameDetailsUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.GamesUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.StandingsUpdateRequest;

/**
 * Device REST API endpoints exposed by the server and used by management apps.
 */
public enum ManagementApiEndpoints {

  /**
   * Endpoint for stats synchronization.
   *
   * @see StandingsUpdateRequest
   */
  UPDATE_STANDINGS(Constants.MANAGEMENT_API_ROOT_PATH + "/standings/update"),

  /**
   * Endpoint for version synchronization.
   *
   * @see GamesUpdateRequest
   */
  UPDATE_GAMES(Constants.MANAGEMENT_API_ROOT_PATH + "/games/update"),

  /**
   * Endpoint for game details retrieval.
   *
   * @see GameDetailsUpdateRequest
   */
  UPDATE_GAME_DETAILS(Constants.MANAGEMENT_API_ROOT_PATH + "/game/update");

  private final String url;

  ManagementApiEndpoints(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  private static class Constants {

    private static final String MANAGEMENT_API_ROOT_PATH = "/api/management/v1";
  }
}
