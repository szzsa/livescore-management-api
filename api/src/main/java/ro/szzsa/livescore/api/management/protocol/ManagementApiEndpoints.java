package ro.szzsa.livescore.api.management.protocol;

import ro.szzsa.livescore.api.management.protocol.request.GameDetailsUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.GamesUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.LeaguePhaseUpdateRequest;

/**
 * Management REST API endpoints exposed by the server and used by management apps.
 */
public final class ManagementApiEndpoints {

  public static final String MANAGEMENT_API_ROOT_PATH = "/api/management";

  public static final String MANAGEMENT_API_V1_ROOT_PATH = MANAGEMENT_API_ROOT_PATH + "/v1";

  public static final String UPDATE_LEAGUE_PHASES_PATH = "/stats/update";

  public static final String UPDATE_GAMES_PATH = "/games/update";

  public static final String UPDATE_GAME_DETAILS_PATH = "/game/update";

  /**
   * Endpoint for stats synchronization.
   *
   * @see LeaguePhaseUpdateRequest
   */
  public static final String UPDATE_LEAGUE_PHASES_URL = MANAGEMENT_API_V1_ROOT_PATH + UPDATE_LEAGUE_PHASES_PATH;

  /**
   * Endpoint for version synchronization.
   *
   * @see GamesUpdateRequest
   */
  public static final String UPDATE_GAMES_URL = MANAGEMENT_API_V1_ROOT_PATH + UPDATE_GAMES_PATH;

  /**
   * Endpoint for game details retrieval.
   *
   * @see GameDetailsUpdateRequest
   */
  public static final String UPDATE_GAME_DETAILS_URL = MANAGEMENT_API_V1_ROOT_PATH + UPDATE_GAME_DETAILS_PATH;

  private ManagementApiEndpoints() {
    throw new UnsupportedOperationException();
  }
}
