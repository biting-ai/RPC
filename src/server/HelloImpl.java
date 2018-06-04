package server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程方法接口实现类
 * @author chenjia
 * @version v1.0
 * @date 2018-06-04 13:13
 */
public class HelloImpl extends UnicastRemoteObject implements Hello,Serializable {


    private static final long serialVersionUID = -202788818489571285L;

    public HelloImpl() throws RemoteException {
        super();
    }


    @Override
    public String sayHello(String name) throws RemoteException {
        return "server.Hello,"+name;
    }
}
