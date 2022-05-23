package cdi;


import javax.enterprise.context.*;
import javax.inject.Named;

//kapsam
//yaşam süresi
//performansı etkiler
@Named
//@ApplicationScoped  //tüm uygulama boyunca bütün kullanıcılar için çalışır
//@RequestScoped  //bir istek boyunca, Bean 1 instance olmasını sağlamak için
//@SessionScoped  //bir kullanıcı için yaşar. Ancak logout oldugunda biter
//@Dependent  //bulunduğu yapı hangi scope'ta ise denpendent onu sağlıyor
//@ConversationScoped //belirli istek boyunca yaşar

public class _00_Scoped {
}
