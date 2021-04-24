package sit.integrated.project.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Products {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name ="Product_id")
    private String productId;

    @Getter
    @Setter
    @Column(name ="Product_name")
    private String productName;

    @Getter
    @Setter
    @Column(name ="Product_Type")
    private String productType;

    @Getter
    @Setter
    @Column(name ="Product_Description")
    private String productDescription	;

    @Getter
    @Setter
    @Column(name ="Product_Price")
    private double product_Price;

    @Getter
    @Setter
    @Column(name ="Product_Size")
    private String productSize;

    @Getter
    @Setter
    @Column(name ="Product_Gender")
    private char productGender;

    @Getter
    @Setter
    @Column(name ="Product_Image")
    private double productImage;

    @Getter
    @Setter
    @Column(name ="product_Manufactured")
    private Date date;

    @ManyToOne @JoinColumn(name = "Product_id" , nullable = false)
    @Getter @Setter private Brands ProductBrands;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "ProductColors" ,
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    @Getter @Setter private List<Colors> ProductColors;


}

