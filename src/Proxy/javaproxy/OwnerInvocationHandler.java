package Proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean p){
        person = p;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            //If the method is a
            //getter, we go ahead
            //and invoke it on the
            //real subject.
            if (method.getName().startsWith("get")){
                return method.invoke(person, args);
            }
            //Otherwise, if it is the
            //setHotOrNotRating()
            //method we disallow
            //it by throwing a
            //IllegalAccessException.
            else if (method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessError();
            } else if (method.getName().startsWith("set")){
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        //If any other method is called,
        //we’re just going to return null
        //rather than take a chance.
        return null;
    }
}
