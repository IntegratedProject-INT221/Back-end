package sit.integrated.project.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
@Entity
@Table(name = "products")
@Getter@Setter
public class Products {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Date date;

    @ManyToOne
    @JoinColumn(name="Brands_brandId", nullable=false)
    private Brands BrandId;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "products_colors" ,
            joinColumns = @JoinColumn(name = "products_productid"),
            inverseJoinColumns = @JoinColumn(name = "colors_colorid")
    )

    private List<Colors> ProductColors= new ArrayList<>();


}

