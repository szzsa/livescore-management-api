package ro.szzsa.livescore.api.management.client;

import java.util.List;

import ro.szzsa.livescore.api.management.client.exception.ManagementApiException;
import ro.szzsa.livescore.api.management.protocol.ManagementApiEndpoints;
import ro.szzsa.livescore.api.management.protocol.request.GameDetailsUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.GamesUpdateRequest;
import ro.szzsa.livescore.api.management.protocol.request.LeaguePhaseUpdateRequest;
import ro.szzsa.livescore.model.Game;
import ro.szzsa.livescore.model.LeaguePhase;
import ro.szzsa.utils.connector.Connector;
import ro.szzsa.utils.connector.HttpConnectorBuilder;
import ro.szzsa.utils.connector.Request;
import ro.szzsa.utils.converter.Converter;
import ro.szzsa.utils.converter.Converters;

public class ManagementApiHttpClient implements ManagementApiClient {

  private final String serverUrl;

  private final Connector connector;

  private final Converter converter;

  public ManagementApiHttpClient(String serverUrl, String username, String password) {
    this.serverUrl = serverUrl;
    connector = new HttpConnectorBuilder(username, password).build();
    converter = Converters.createJsonConverter();
  }

  public ManagementApiHttpClient(String serverUrl, Connector connector) {
    this.serverUrl = serverUrl;
    this.connector = connector;
    converter = Converters.createJsonConverter();
  }

  @Override
  public void updateLeaguePhases(List<LeaguePhase> leaguePhases) throws ManagementApiException {
    try {
      LeaguePhaseUpdateRequest requestPayload = new LeaguePhaseUpdateRequest();
      requestPayload.setLeaguePhases(leaguePhases);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + ManagementApiEndpoints.UPDATE_LEAGUE_PHASES_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new ManagementApiException(e);
    }
  }

  @Override
  public void updateGames(List<Game> games) throws ManagementApiException {
    try {
      GamesUpdateRequest requestPayload = new GamesUpdateRequest();
      requestPayload.setGames(games);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + ManagementApiEndpoints.UPDATE_GAMES_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new ManagementApiException(e);
    }
  }

  @Override
  public void updateGameDetails(Game gameDetails) throws ManagementApiException {
    try {
      GameDetailsUpdateRequest requestPayload = new GameDetailsUpdateRequest();
      requestPayload.setGameDetails(gameDetails);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + ManagementApiEndpoints.UPDATE_GAME_DETAILS_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new ManagementApiException(e);
    }
  }
}
