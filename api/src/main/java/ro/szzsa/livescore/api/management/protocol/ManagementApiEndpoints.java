package ro.szzsa.livescore.api.management.protocol;

import ro.szzsa.livescore.api.management.protocol.request.GameDetailsUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.GamesUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.StandingsUpdateRequest;

/**
 * Management REST API endpoints exposed by the server and used by management apps.
 */
public final class ManagementApiEndpoints {

  public static final String MANAGEMENT_API_ROOT_PATH = "/api/management/v1";

  public static final String UPDATE_STANDINGS_PATH = "/standings/update";

  public static final String UPDATE_GAMES_PATH = "/games/update";

  public static final String UPDATE_GAME_DETAILS_PATH = "/game/update";

  /**
   * Endpoint for stats synchronization.
   *
   * @see StandingsUpdateRequest
   */
  public static final String UPDATE_STANDINGS_URL = MANAGEMENT_API_ROOT_PATH + UPDATE_STANDINGS_PATH;

  /**
   * Endpoint for version synchronization.
   *
   * @see GamesUpdateRequest
   */
  public static final String UPDATE_GAMES_URL = MANAGEMENT_API_ROOT_PATH + UPDATE_GAMES_PATH;

  /**
   * Endpoint for game details retrieval.
   *
   * @see GameDetailsUpdateRequest
   */
  public static final String UPDATE_GAME_DETAILS_URL = MANAGEMENT_API_ROOT_PATH + UPDATE_GAME_DETAILS_PATH;

  private ManagementApiEndpoints() {
    throw new UnsupportedOperationException();
  }
}
