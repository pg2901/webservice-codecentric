package a.widget

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table("FEEDBACK")
data class Feedback(
    @Id
    var id: UUID?,
    val rating: Int,
    val text: String
)
