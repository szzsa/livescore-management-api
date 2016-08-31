package ro.szzsa.livescore.api.management.protocol.request;

import ro.szzsa.livescore.model.GameDetails;

public class GameDetailsUpdateRequest {

  private GameDetails gameDetails;

  public GameDetails getGameDetails() {
    return gameDetails;
  }

  public void setGameDetails(GameDetails gameDetails) {
    this.gameDetails = gameDetails;
  }
}
