class SecurityFilters {

    def filters = {
        loginCheck(controller: '*', action: '*') {
            before = {
                def allowedActions = ["logIn", "loggedIn", "logout"]
                if (!session.user && !allowedActions.contains(actionName)) {
                    //redirect(controller: "user", action: "login")
                    return true //TODO leave false later
                }
            }
        }
    }
}
