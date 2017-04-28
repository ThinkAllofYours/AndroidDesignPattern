package kr.co.yjglogitech.androiddesignpattern.java.ch03_Template_Method_Pattern;

/**
 * Created by lyder on 2017-04-28.
 */

public abstract class AbstConnectHelper {
    abstract protected String doSecurity(String info);
    abstract protected String authentication(String id, String password);
    abstract protected int authorization(String userName);
    abstract protected String connection(String info);

    //여기안에 들어있는 로직은
    public String requestConnection(String info){
        String id,password, userName, decodeInfo, userInfo;

        //암호화된 정보를 복호화 합니다.
        decodeInfo = doSecurity(info);

        //decodedInfo에서 id와 password를 추출했다고 가정
        id = "abc";
        password = "abc";

        userInfo = authentication(id, password);

        //userInfo에서 userName을 찾아 냅니다.
        userName = "abc";

        int result = authorization(userName);

        switch (result){
            case 0: //무료회원
                userInfo = "FreeUser";
                break;
            case 1: //유료회원
                userInfo = "GetAuthor";
                break;
            case 2: //게임 마스터
                userInfo = "GameMaster";
                break;
            case 3: //접속 권한 없음
                userInfo = "NoConnection";
                break;
            default:
                break;
        }
        return connection(userInfo);
    }


}
