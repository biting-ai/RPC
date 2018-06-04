package client;

import server.Hello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author chenjia
 * @version v1.0
 * @date 2018-06-04 14:20
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello h = (Hello) Naming.lookup("rmi://192.168.212.177:12312/Hello");
            System.out.println(h.sayHello("cj"));
        } catch (MalformedURLException e) {
            System.out.println("url格式异常");
        } catch (RemoteException e) {
            System.out.println("创建对象异常");
            e.printStackTrace();
        } catch (NotBoundException e) {
            System.out.println("对象未绑定");
        }
    }
}
