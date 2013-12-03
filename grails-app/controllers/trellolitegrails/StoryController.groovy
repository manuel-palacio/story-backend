package trellolitegrails

import grails.rest.RestfulController
import grails.transaction.Transactional

class StoryController extends RestfulController<Story> {

    static responseFormats = ['json']

    StoryController() {
        super(Story)
    }

    @Transactional
    def save(Story story) {
        story.save flush: true
        render text: "Saved", status: 200
    }

    @Transactional
    def update(Story story) {
        story.save flush: true
        render text: "Saved", status: 200
    }

    def delete(Story story) {
        story.delete flush: true
        render text: "Deleted", status: 200
    }

    def show(Story story) {
        if (!story) {
            render status: 404
        } else {
            return [story: story]
        }
    }

    def index = {
        respond Story.list()
    }
}
