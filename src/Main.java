import services.CalcService;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        CalcService service = new CalcService();
        Endpoint.publish("http://localhost:2000/calc", service);
    }
}
