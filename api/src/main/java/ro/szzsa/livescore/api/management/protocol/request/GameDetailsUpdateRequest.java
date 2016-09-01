package ro.szzsa.livescore.api.management.protocol.request;

import ro.szzsa.livescore.model.Game;

public class GameDetailsUpdateRequest {

  private Game gameDetails;

  public Game getGameDetails() {
    return gameDetails;
  }

  public void setGameDetails(Game gameDetails) {
    this.gameDetails = gameDetails;
  }
}
