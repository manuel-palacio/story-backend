package trellolitegrails

import groovy.transform.ToString
import org.bson.types.ObjectId

@ToString
class Story {

    static constraints = {
    }

    String id

    String title
    String criteria
    String status
    String type
    String reporter
    String assignee
    String description
}
