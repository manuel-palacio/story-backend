class UrlMappings {

	static mappings = {

        "/auth/$action"(controller: "login", parseRequest: true)

        "/resources/stories"(resources:"Story")

        "/"(resource:"/index")

        "500"(view: "error")

	}
}
