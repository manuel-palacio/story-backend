package login

class LoginController {

    static allowedMethods = [loggedIn: 'GET', logIn: 'POST', logout: 'POST']

    def loggedIn() {
        if (session.user && session.user == "admin") {
            render "true"
        } else {
            render "false"
        }
    }

    def logIn () {
        def jsonObj = request.JSON
        def userName = jsonObj.credentials.username
        def password = jsonObj.credentials.password
        if (userName == "admin" && password == "admin") {
            session.user = userName
            response.sendError(200)
        } else {
            response.sendError(401, "You are not a valid user")
        }
    }

    def logout () {
        session.invalidate()
        render "Over and out"
    }
}


