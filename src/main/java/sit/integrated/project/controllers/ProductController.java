package sit.integrated.project.controllers;


import sit.integrated.project.models.Products;
import sit.integrated.project.repositories.ProductsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
    private ProductsRepositories productsRepositories;

@GetMapping("/item")
public List<Products> getAllProduct(){return productsRepositories.findAll();
}

}
