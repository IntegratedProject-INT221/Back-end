package sit.integrated.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "colors")
@Getter@Setter
//@AllArgsConstructor
public class Colors {
    @Id
    @Column(name ="colorid")
    private String colorId;

    @Column(name ="colorname")
    private String colorName;


    @Column(name ="codecolor")
    private String CodeColor;
}
