package a.widget

import org.springframework.stereotype.Service

@Service
class FeedbackService(val db: FeedbackRepository) {
    fun findAll(): List<Feedback> = db.findThemAll()

    fun post(feedback: Feedback) {
        db.save(feedback)
    }
}
