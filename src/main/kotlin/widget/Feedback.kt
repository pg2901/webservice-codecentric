package widget

import jakarta.persistence.*

@Entity
@Table(name="FEEDBACK")
class Feedback {

    //Id : primary key
    @Id @GeneratedValue
    val Id: Int,

    //Wertung : ganzzahl 1-5
    @Column(nullable = false)
    val rating : Int,
    
    //Frei text
    @Column(nullable = false)
    val text: String
}