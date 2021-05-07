package sit.integrated.project.controllers;



import org.springframework.web.bind.annotation.*;
import sit.integrated.project.exceptions.ExceptionResponse;
import sit.integrated.project.exceptions.ProductsException;
import sit.integrated.project.models.Products;
import sit.integrated.project.repositories.ProductsRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/Products")
@CrossOrigin
public class ProductController {
@Autowired
    private ProductsRepositories productsRepositories;
    private  Products Product;


   @GetMapping("/GetProducts")
   public List<Products> getAllProduct(){return productsRepositories.findAll(); }

    @GetMapping("/GetProducts/{id}")
    public  Products getProductById(@PathVariable int id){ return  productsRepositories.findById(id).orElse(null); }

     @PostMapping("/Create")
    public Products createProduct(@RequestBody Products products){
       products.setProductId(productsRepositories.productLatestId()+ 1);
    productsRepositories.save(products);
    return products;

   }


    @PutMapping("/Edit/{id}")
    public Products editProduct(@RequestBody Products products,@PathVariable int id){
        if (hasFoundId(id)) {
            productsRepositories.save(products);
            return products;
        }
        else
            return null;
    }

    @DeleteMapping("/Delete/{id}")
    public void deleteProduct(@PathVariable int id){
        if (hasFoundId(id)) {
            productsRepositories.deleteById(id);
        }
    }


    public boolean hasFoundId(int id){
        List<Products> products = productsRepositories.findAll();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductId() == id){
                return true;
            }
        }
        return false;
    }
}
