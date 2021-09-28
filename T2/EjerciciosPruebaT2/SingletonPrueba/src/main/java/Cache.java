import java.util.HashMap;
import java.util.Map;

public class Cache {
	private static Map<String, String> cache = null;
	
	public static Map<String, String> getCache() {
		if (cache == null) {
			cache = new HashMap<String, String>();
		}
		return cache;
	}
}
