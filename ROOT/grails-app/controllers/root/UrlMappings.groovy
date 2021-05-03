package root

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/about"(view:"/about")
        "/contact"(view:"/contact")
        "/domain"(view:"/domain")
        "/mail-hosting"(view:"/mailhosting")
        "/managed-cloud-solutions"(view:"/managedcloudsolutions")
        "/contact"(view:"/contact")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
