package ro.szzsa.livescore.api.management.protocol.request;

import ro.szzsa.livescore.model.Standings;

public class StandingsUpdateRequest {

  private Standings standings;

  public Standings getStandings() {
    return standings;
  }

  public void setStandings(Standings standings) {
    this.standings = standings;
  }
}
