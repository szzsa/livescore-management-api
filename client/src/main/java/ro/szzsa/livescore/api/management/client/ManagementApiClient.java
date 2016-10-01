package ro.szzsa.livescore.api.management.client;

import java.util.List;

import ro.szzsa.livescore.api.management.client.exception.ManagementApiException;
import ro.szzsa.livescore.model.Game;
import ro.szzsa.livescore.model.LeaguePhase;

/**
 * Client of management API.
 */
public interface ManagementApiClient {

  void updateLeaguePhases(List<LeaguePhase> leaguePhases) throws ManagementApiException;

  void updateGames(List<Game> games) throws ManagementApiException;

  void updateGameDetails(Game gameDetails) throws ManagementApiException;
}
