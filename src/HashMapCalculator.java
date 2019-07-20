import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {

		int commonEntries = 0;

		for (String name : map1.keySet()) {

			if (map2.containsKey(name)) {

				if (map1.get(name).equals(map2.get(name))) {

					commonEntries++;
				}
			}

		}

		return commonEntries;
	}

}
