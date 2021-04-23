package sit.integrated.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.integrated.project.models.Products;
public interface ProductsRepositories extends JpaRepository<Products,String> {
}
