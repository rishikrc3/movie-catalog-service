package com.Rishik.moviecatalogservice.resources;

import com.Rishik.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers","Test",4)
        );
    }
}
