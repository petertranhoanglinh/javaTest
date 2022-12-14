package javaTest;

import java.util.Date;
import java.util.UUID;

public class AlertService {
	 private final MapAlertDAO storage = new MapAlertDAO();
		
    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }
	
    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }	
}
