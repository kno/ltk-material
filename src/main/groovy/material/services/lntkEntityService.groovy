package material.services

import material.domain.LntkEntity
import grails.gorm.services.Service

import javax.validation.constraints.NotBlank

@Service(LntkEntity)
interface LntkEntityService {
    List<LntkEntity> findByName(@NotBlank String name)
}
