package ro.szzsa.livescore.api.management.client;

import java.util.List;

import ro.szzsa.livescore.api.management.client.exception.ManagementApiException;
import ro.szzsa.livescore.model.Game;
import ro.szzsa.livescore.model.Standings;

/**
 * Client of management API.
 */
public interface ManagementApiClient {

  void updateStandings(Standings standings) throws ManagementApiException;

  void updateGames(List<Game> games) throws ManagementApiException;

  void updateGameDetails(Game gameDetails) throws ManagementApiException;
}
