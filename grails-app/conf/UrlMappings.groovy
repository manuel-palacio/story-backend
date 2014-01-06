class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/auth/$action"(controller: "login", parseRequest: true)

        "/resources/stories"(resources:"Story")

        "/"(resource:"/index.html")

        "500"(view: "error")

	}
}
