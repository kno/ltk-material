package material.domain

import grails.gorm.annotation.Entity

@Entity
class LntkEntity{
    String id
    String reference
    String name
    Date creationDate
    Date updateDate
    String tenantId
    String plantId
    String createdById
    String updateById
    String description
    static mapping = {
        id generator: 'uuid'
        tablePerHierarchy false 
    }

}