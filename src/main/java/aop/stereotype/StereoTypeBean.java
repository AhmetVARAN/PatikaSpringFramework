package aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@MyStereoType
@Data @NoArgsConstructor @AllArgsConstructor    //lombok kütüphaneleri ayrıca yazılır

public class StereoTypeBean {
    private Long id;
    private String name = "Merhaba";
    private String trade;
}
