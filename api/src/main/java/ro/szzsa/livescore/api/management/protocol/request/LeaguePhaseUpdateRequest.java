package ro.szzsa.livescore.api.management.protocol.request;

import java.util.List;

import ro.szzsa.livescore.model.LeaguePhase;

public class LeaguePhaseUpdateRequest {

  private List<LeaguePhase> leaguePhases;

  public List<LeaguePhase> getLeaguePhases() {
    return leaguePhases;
  }

  public void setLeaguePhases(List<LeaguePhase> leaguePhases) {
    this.leaguePhases = leaguePhases;
  }
}
