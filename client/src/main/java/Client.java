import log_in_web_service.LogInWebService;
import log_in_web_service.LogInWebServiceImplService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Client {

    public static void main(String[] args) {
        LogInWebService logIn = new LogInWebServiceImplService().getLogInWebServiceImplPort();
        String user;
        while (true) {
            System.out.println("Input id and password:");
            Scanner scanner2 = new Scanner(System.in);
            String id = scanner2.nextLine();
            Scanner scanner3 = new Scanner(System.in);
            String password = scanner3.nextLine();
            user = logIn.logIn(id, password);
            if (!user.equals("error")){
                break;
            }else {
                System.out.println("Id or password is not correct, please try again.");
            }
        }
        try {
            Class person = Class.forName(user);
            Method method = person.getMethod("run");
            Object obj = person.getConstructor().newInstance();
            method.invoke(obj);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
