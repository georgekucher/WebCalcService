package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalcService {
    @WebMethod
    public String summ(int a, int b) {
        return "Summ is " + String.valueOf(a + b);
    }
}
