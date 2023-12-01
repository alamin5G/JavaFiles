package OS_info;

public class GetOSInfo {
    public static void main(String[] args){
        String os = System.getProperty("os.name");
        System.out.println("You are using " + os);
    }
}
