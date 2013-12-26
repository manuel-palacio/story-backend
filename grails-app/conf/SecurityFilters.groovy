import javax.servlet.http.HttpServletResponse

class SecurityFilters {

    def filters = {
        loginCheck(controller: '*', action: '*') {
            before = {
                def allowedActions = ["logIn", "loggedIn", "logout"]
                if (!session.user && !allowedActions.contains(actionName)) {
                    //redirect(controller: "user", action: "login")
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Not authorized")
                    return false
                }
            }
        }
    }
}
