package widget

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class CommentController(val service: FeedbackService) {

    @GetMapping("/comments")
    fun sendAll() {
        return service.findAll();
    }

    @PostMapping("/comments")
    fun saveFeedback(@RequestBody feedback: Feedback) {
        service.post(feedback)
    }

}