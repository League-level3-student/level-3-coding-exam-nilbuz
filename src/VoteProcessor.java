import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> arrayList) {

		int popeCount = 0;
		int edCount = 0;

		for (int i = 0; i < arrayList.size(); i++) {

			if (arrayList.get(i).toString().toLowerCase().equals("pope francis")) {

				popeCount++;
			} else {

				edCount++;
			}

		}

		if (popeCount > edCount) {
			return "pope francis";
		}

		if (edCount > popeCount) {
			return "edward snowden";
		} else {
			return "TIE";
		}

	}
}
