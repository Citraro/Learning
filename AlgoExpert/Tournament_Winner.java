import java.util.*;

// O(n) time | O(numberOfTeams)

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    
		HashMap<String,Integer> res = new HashMap<>();
		int maxPoints = 0;
		String currentBest = "";
		
		for(int i = 0; i < competitions.size(); i++){
			ArrayList<String> competition = competitions.get(i);
			int winnerTeamPos = results.get(i) == 0 ? 1 : 0;
			if(res.containsKey(competition.get(winnerTeamPos))){
				res.replace(competition.get(winnerTeamPos), res.get(competition.get(winnerTeamPos)) + 3);
			} else {
				res.put(competition.get(winnerTeamPos), 3);
			}
			
			if(maxPoints < res.get(competition.get(winnerTeamPos))){
				maxPoints = res.get(competition.get(winnerTeamPos));
				currentBest = competition.get(winnerTeamPos);
			}
			
		}
		
		
    return currentBest;
  }
}
