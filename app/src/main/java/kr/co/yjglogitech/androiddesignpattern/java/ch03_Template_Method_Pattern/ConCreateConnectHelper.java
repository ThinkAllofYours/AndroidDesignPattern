package kr.co.yjglogitech.androiddesignpattern.java.ch03_Template_Method_Pattern;

/**
 * Created by lyder on 2017-04-28.
 */

public class ConCreateConnectHelper extends AbstConnectHelper {

    @Override
    protected String doSecurity(String info) {
        return info;
    }

    @Override
    protected String authentication(String id, String password) {
        if(id.equals("abc")|password.equals("abc"))
            return "true info";
        else
            return "false info";
    }

    @Override
    protected int authorization(String userName) {
        return 0;
    }

    @Override
    protected String connection(String info) {
        return info;
    }
}
