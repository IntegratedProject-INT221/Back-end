package sit.integrated.project.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import sit.integrated.project.models.Products;
import sit.integrated.project.repositories.ProductsRepositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


@RestController
@RequestMapping("/Images")
public class ImageController {
//@Autowired
//    ProductsRepositories productsRepositories;


String FILE_DIRECTORY = "./images/";

@GetMapping("/Get/{filename:,+")
    public ResponseEntity<byte[]> getImages(@PathVariable("filename") String filename) throws IOException{
    System.out.println(filename);
    FileInputStream fileInputStream = new FileInputStream("images\\" +filename);
    byte[] images = fileInputStream.readAllBytes();
    return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(images);
}
@PostMapping("/upload/{id}")
    public void imageUpload(@RequestParam("File")MultipartFile file, @PathVariable("id") int id ) throws IOException{
    File imageFile = new File (  FILE_DIRECTORY + file.getOriginalFilename());
    imageFile.createNewFile();
    FileOutputStream fos = new FileOutputStream(imageFile);
    fos.write(file.getBytes());
    fos.close();

}
}
