package sit.integrated.project.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;
@Entity
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Color_id")
    @Getter
    @Setter
    private int colorId;

    @Getter
    @Setter
    @Column(name ="Color_Name")
    private String colorName;

//    @Getter
//    @Setter
//    @Column(name ="colorhex")
//    private String colorHex;
}
