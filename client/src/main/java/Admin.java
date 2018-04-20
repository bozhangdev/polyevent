import admin_web_service.AdminWebService;
import admin_web_service.AdminWebServiceImplService;
import organiser_web_service.Demand;

import java.util.Scanner;

public class Admin {
    AdminWebService service = new AdminWebServiceImplService().getAdminWebServiceImplPort();
    public void run(){
        while (true){
            System.out.println("Press 1 to add event:");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            System.out.println(service.addEvent());
        }
    }
}
