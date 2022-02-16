import org.springframework.stereotype.Service

@Service
class FeedbackService(val db: FeedbackRepository) {
    fun findAll(): List<Feedback> = db.findAll()

    fun post(feedback: Feedback) {
        db.save(feedback)
    }
}