package material.controllers

import material.api.MaterialApi
import material.domain.Material
import material.services.MaterialService

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/materials")
@CompileStatic
class MaterialController implements MaterialApi {
    
    final MaterialService MaterialService
    
    MaterialController(MaterialService MaterialService) {
        this.MaterialService = MaterialService
    }
    
    @Get("/")
    List<Material> listMaterial() {
        return MaterialService.findAll()
    }
    
    @Override
    @Get("/{id}")
    Material show(Long id) {
        return MaterialService.find(id)
    }
    
    @Post("/")
    Material save(Material material) {
        return MaterialService.save(material)
    }
    
    @Get('/byName/{name}')
    List <Material> listMaterialByName(String name) {
        return MaterialService.findAllByNameLike(name)
    }

    @Get('/byPrice')
    List <Material> listMaterialByName(double price) {
        //return Material.findAllByPrice(price)
        return MaterialService.findAllByPrice(price)
    }

}