package sit.integrated.project.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
@Entity
@Table(name = "Products")
@Getter@Setter
public class Products {

    @Id

    @Column( name ="productid")
    private Integer productId;


    @Column(name ="productname")
    private String productName;


    @Column(name ="producttype")
    private String productType;


    @Column(name ="productdescription")
    private String productDescription;


    @Column(name ="productprice")
    private double productPrice;


    @Column(name ="productgender")
    private String productGender;


    @Column(name ="productmanufactured")
    private LocalDate date  ;

    @ManyToOne
    @JoinColumn(name="brands_brandid", nullable=false)
    private Brands BrandId;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "Products_Colors" ,
            joinColumns = @JoinColumn(name = "products_productid"),
            inverseJoinColumns = @JoinColumn(name = "colors_colorid")
    )

    private List<Colors> ProductColors= new ArrayList<>();


}

