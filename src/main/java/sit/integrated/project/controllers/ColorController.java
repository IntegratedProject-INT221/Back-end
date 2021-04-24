package sit.integrated.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import sit.integrated.project.models.Colors;
import sit.integrated.project.repositories.ColorsRepositories;

import java.util.List;

public class ColorController {
    @Autowired
    private ColorsRepositories ColorsRepositories;

    @GetMapping("/api/colors")
    public List<Colors> listAllColors(){
        return ColorsRepositories.findAll();
    }
}
