package creational.singleton;

import java.io.Serializable;

public class NonSingleton implements Cloneable, Serializable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
