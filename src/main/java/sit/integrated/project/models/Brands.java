package sit.integrated.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
