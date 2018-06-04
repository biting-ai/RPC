package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程方法接口，该接口必须继承自Remote接口
 * @author chenjia
 * @version v1.0
 * @date 2018-06-04 11:29
 */
public interface Hello extends Remote {
    String sayHello(String name) throws RemoteException;
}
