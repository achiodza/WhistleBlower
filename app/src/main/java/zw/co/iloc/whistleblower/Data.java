package zw.co.iloc.whistleblower;

public class Data {

    private String uid;
    private String msg;
    private String location;


    public Data(){

    }


    public Data(String uid, String msg,String location) {
        this.uid = uid;
        this.msg = msg;
        this.location =location;

    }

    public String getUid() {
        return uid;
    }

    public String getMsg() {
        return msg;
    }

    public String getLocation(){
        return location;
    }






}
