package sit.integrated.project.repositories;

import sit.integrated.project.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepositories extends JpaRepository<Products,Integer> {
}