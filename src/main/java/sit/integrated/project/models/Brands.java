package sit.integrated.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brands")
@Getter@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brandid")
    private String brandId;

    @Column(name = "brandname")
    private String brandName;
}
