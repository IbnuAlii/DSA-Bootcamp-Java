package Abstraction_and_Coupling.ReduceCoupling;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequist(ip);
        System.out.println(html);

    }

    private String sendHttpRequist(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "192.168.1.1";
    }
}
