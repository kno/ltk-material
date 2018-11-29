package material.api

import material.domain.Material
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

interface MaterialApi {
    @Get("/")
    List<Material> listMaterial()
    
    @Get("/{id}")
    Material show(Long id)
    
    /*@Post("/")
    Material save(Material material)*/
}