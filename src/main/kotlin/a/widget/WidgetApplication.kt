package widget

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import org.springframework.stereotype.Service

@SpringBootApplication
class WidgetApplication

fun main(args: Array<String>) {
	runApplication<WidgetApplication>(*args)
}

@Table("FEEDBACK")
data class Feedback(@Id val id: Int, val rating: Int, val text: String)

interface FeedbackRepository: CrudRepository<Feedback, Int>{

    @Query("select * from feedback")
    fun findThemAll(): List<Feedback>
}

@Service
class FeedbackService(val db: FeedbackRepository) {
    fun findAll(): List<Feedback> = db.findThemAll()

    fun post(feedback: Feedback) {
        db.save(feedback)
    }
}

@RestController
class CommentController(val service: FeedbackService) {

    @GetMapping("/comments")
    fun index(): List<Feedback> = service.findAll()

    @PostMapping("/comments")
    fun saveFeedback(@RequestBody feedback: Feedback) {
        service.post(feedback)
    }

}
