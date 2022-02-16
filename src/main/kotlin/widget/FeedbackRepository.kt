import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface FeedbackRepository: CrudRepository<Feedback, Int>{

    @Query("select * from feedback")
    fun findAll(): List<Feedback>
}