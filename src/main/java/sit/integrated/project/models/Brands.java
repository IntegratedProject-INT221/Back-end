package sit.integrated.project.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Brand_id")
    @Getter
    @Setter
    private String brandId;

    @Getter@Setter
    @Column(name = "Brand_Name")
    private String brandName;
}
