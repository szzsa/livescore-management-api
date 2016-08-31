package ro.szzsa.livescore.api.management.client;

import java.util.List;

import ro.szzsa.livescore.api.management.client.exception.ManagementApiException;
import ro.szzsa.livescore.model.Game;
import ro.szzsa.livescore.model.GameDetails;
import ro.szzsa.livescore.model.Standings;

/**
 * Client of device API.
 */
public interface ManagementApiClient {

  void updateStandings(Standings standings) throws ManagementApiException;

  void updateGames(List<Game> games) throws ManagementApiException;

  void updateGameDetails(GameDetails gameDetails) throws ManagementApiException;
}
