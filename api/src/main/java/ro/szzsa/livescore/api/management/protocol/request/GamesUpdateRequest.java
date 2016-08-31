package ro.szzsa.livescore.api.management.protocol.request;

import java.util.List;

import ro.szzsa.livescore.model.Game;

public class GamesUpdateRequest {

  private List<Game> games;

  public List<Game> getGames() {
    return games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }
}
