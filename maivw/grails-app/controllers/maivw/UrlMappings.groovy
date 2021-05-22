package maivw

class UrlMappings {

    static mappings = {
        "/maivw/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/maivw/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
