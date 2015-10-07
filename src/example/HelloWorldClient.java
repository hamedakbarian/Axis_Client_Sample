package example;

import Axis.Hello;
import Axis.HelloWorldServiceLocator;
import Axis.HelloWorld_PortType;
import Services.ReturnMessage;
import Services.ServicesServiceLocator;
import Services.Services_PortType;
import Services.SigninInfo;

import java.util.Date;

/**
 * Created by weblogic12 on 4/29/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
//          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
//          HelloWorld_PortType service = locator.getHelloWorld();
          // If authorization is required
          //((HelloWorldSoapBindingStub)service).setUsername("user3");
          //((HelloWorldSoapBindingStub)service).setPassword("pass3");
          // invoke business method
//          System.out.println(service.sayHelloWorldFrom("Hamed"));
//          Hello hi = new Hello();
//          hi.setHi("Hamed");
//          System.out.println(service.sayHowAreYouFrom(hi));

          ServicesServiceLocator locator = new ServicesServiceLocator();
          Services_PortType services = locator.getServices();
          SigninInfo signinInfo = new SigninInfo();
          signinInfo.setPersonNin(Long.parseLong("2649593873"));
          signinInfo.setIp("10.92.20.11");
          Date date = new Date();
          //signinInfo.setRequest_Date("13900519");
          //ReturnMessage returnMessage = services.signinUser(signinInfo, "HVL1", "BA1EAE523DBC6C36AD239B027F6A2E50939D5224");
          String userId = services.getActiveUser("10.7.17.154", "HVL1", "HVL1");
          //String user_id = services.getActiveUser("fvsdg", "HVL1", "HVL1");
          //ReturnMessage returnMessage = services.signoutUserByUserNin(Long.parseLong("2649593873"), "HVL1", "HVL1");

          System.out.println(userId);
          //System.out.println(user_id);
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
