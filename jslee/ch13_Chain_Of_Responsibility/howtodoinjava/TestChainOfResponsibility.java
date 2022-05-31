package howtodoinjava;


import howtodoinjava.data.ServiceRequest;
import howtodoinjava.handler.*;

public class TestChainOfResponsibility {
	public static void main(String[] args) 
	{
		// ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		// SupportService supportService = (SupportService) context.getBean("supportService");
		DirectorSupport directorSupport = new DirectorSupport();

		SupportService supportService = new SupportService();
		supportService.setHandler(directorSupport);

		// =============================================
		ServiceRequest request1 = new ServiceRequest();
		request1.setType(ServiceLevel.LEVEL_ONE);
		supportService.handleRequest(request1);
		System.out.println(request1.getConclusion());


		ServiceRequest request2 = new ServiceRequest();
		request2.setType(ServiceLevel.LEVEL_THREE);
		supportService.handleRequest(request2);
		System.out.println(request2.getConclusion());


		ServiceRequest request3 = new ServiceRequest();
		request3.setType(ServiceLevel.INVALID_REQUEST);
		supportService.handleRequest(request3);
		System.out.println(request3.getConclusion());
	}
}
