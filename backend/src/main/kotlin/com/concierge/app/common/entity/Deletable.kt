package com.concierge.app.common.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.time.Instant

@MappedSuperclass
abstract class Deletable : Auditable() {
    @Column(name = "deleted_at")
    var deletedAt: Instant? = null

    fun isDeleted(): Boolean = deletedAt != null

    fun markAsDeleted() {
        deletedAt = Instant.now()
    }

    fun restore() {
        deletedAt = null
    }
}