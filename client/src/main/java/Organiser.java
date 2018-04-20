import organiser_web_service.Demand;
import organiser_web_service.OrganiserWebService;
import organiser_web_service.OrganiserWebServiceImplService;

import java.util.Scanner;

public class Organiser {
    OrganiserWebService service = new OrganiserWebServiceImplService().getOrganiserWebServiceImplPort();
    public void run(){
        while (true){
            System.out.println("Press 1 to add demand:");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            System.out.println(service.addDemand(new Demand()));
        }
    }
}
