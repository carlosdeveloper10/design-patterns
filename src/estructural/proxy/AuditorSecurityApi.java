package estructural.proxy;

import java.util.Calendar;

public class AuditorSecurityApi {

	public boolean isAuditDay() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
	}

}
