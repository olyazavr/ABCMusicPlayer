package player;

import java.util.HashMap;
import java.util.Map;

public class Scales {

	private Map<String, Map> SCALES = new HashMap<String, Map>();

	private String scale;

	private final Map<String,String> C = new HashMap<String,String>();
	private final Map<String,String> AM = new HashMap<String,String>();
	private final Map<String,String> G = new HashMap<String,String>();
	private final Map<String,String> EM = new HashMap<String,String>();
	private final Map<String,String> D = new HashMap<String,String>();
	private final Map<String,String> BM = new HashMap<String,String>();
	private final Map<String,String> A = new HashMap<String,String>();
	private final Map<String,String> FSM = new HashMap<String,String>();
	private final Map<String,String> E = new HashMap<String,String>();
	private final Map<String,String> CSM = new HashMap<String,String>();
	private final Map<String,String> B = new HashMap<String,String>();
	private final Map<String,String> GSM = new HashMap<String,String>();
	private final Map<String,String> FS = new HashMap<String,String>();
	private final Map<String,String> DSM = new HashMap<String,String>();
	private final Map<String,String> D_ = new HashMap<String,String>();
	private final Map<String,String> B_M = new HashMap<String,String>();
	private final Map<String,String> A_ = new HashMap<String,String>();
	private final Map<String,String> FM = new HashMap<String,String>();
	private final Map<String,String> E_ = new HashMap<String,String>();
	private final Map<String,String> CM = new HashMap<String,String>();
	private final Map<String,String> B_ = new HashMap<String,String>();
	private final Map<String,String> GM = new HashMap<String,String>();
	private final Map<String,String> F = new HashMap<String,String>();
	private final Map<String,String> DM = new HashMap<String,String>();
	
	
	public Scales(String key) {

		SCALES.put("Cm",C);
		SCALES.put("Cm",AM);
	}
}