package material.services

import material.domain.Material
import material.domain.LntkEntity
import grails.gorm.services.Service

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import org.springframework.transaction.annotation.Transactional;

@Service(Material)
abstract class MaterialService{
    abstract int count()
    //Material save(@NotBlank String title, @NotBlank String url)
    abstract List<Material> findAll()
    abstract List<Material> findAllByPrice(double price)
    
    @Transactional
    List<Material> findAllByNameLike( String name) {
        Material.findAllByName(name)
    }
    abstract Material find(@NotNull Long id)
}