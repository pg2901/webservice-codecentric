package widget

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import jakarta.persistence.*

@Controller
class CommentController {

    @GetMapping("/comments")
    fun showAll() {
        //get all feedbacks from databank and display

        //EntityManager erzeugen
        val emf = Persistence.createEntityManagerFactory("MyJPAConfig")
        val em = emf.createEntityManager()

        //JPQL Query erzeugen
        val query = em.createQuery("select * from feedback")
        val list = query.getResultList()

        //Alle zurückgeben
        return list
    }

    @PostMapping("/comments")
    fun saveFeedback() {

    }

}