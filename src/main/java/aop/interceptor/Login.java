package aop.interceptor;

@InterceptorYolKesici
public class Login {
    public String isLoginMethod(String data){
        return "is Login "+data;
    }
}
