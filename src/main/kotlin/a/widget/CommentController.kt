package a.widget

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController(val service: FeedbackService) {

    @GetMapping("/comments")
    fun index(): List<Feedback> = service.findAll()

    @PostMapping("/comments")
    fun saveFeedback(@RequestBody feedback: Feedback) {
        service.post(feedback)
    }
}
