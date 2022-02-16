package widget

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("FEEDBACK")
data class Feedback(@Id val id: Int, val rating: Int, val text: String)