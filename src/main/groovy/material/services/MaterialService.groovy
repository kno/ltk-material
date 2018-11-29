package material.services

import material.domain.Material
import material.domain.LntkEntity
import grails.gorm.services.Service

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import grails.gorm.transactions.ReadOnly

interface IMaterialService {
    int count()
    List<Material> findAll()
    List<Material> findAllByPrice(double price)
    Material find(@NotNull Long id)
    Material save(Material material)
}
@Service(Material)
abstract class MaterialService implements IMaterialService {
    @ReadOnly
    List<Material> findAllByNameLike( String nameParam) {
        println(nameParam)
        def a = Material.findAllByNameLike("%" + nameParam + "%")
        println(a)
        a
    }
}