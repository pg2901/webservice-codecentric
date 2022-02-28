package a.widget

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface FeedbackRepository : CrudRepository<Feedback, UUID> {

    @Query("select * from feedback")
    fun findThemAll(): List<Feedback>
}
