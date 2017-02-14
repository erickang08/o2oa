package x.collaboration.service.message;

import com.x.base.core.application.task.ReportTask;
import com.x.base.core.project.AbstractThisApplication;

public class ThisApplication extends AbstractThisApplication {
	public static void init() throws Exception {
		/* 启动报告任务 */
		scheduleWithFixedDelay(new ReportTask(), 1, 20);
		initDatasFromCenters();
		WsConnector.start();
		PushMessageConnector.start();
	}

	public static void destroy() throws Exception {
		WsConnector.stop();
		PushMessageConnector.stop();

	}
}