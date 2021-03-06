package issue10855

class UrlMappings {

    static mappings = {
        "/one"(controller: 'example', action: 'one') {
            arbitrary = 'data1'
        }
        "/two"(controller: 'example', action: 'two') {
            method = 'GET' // <-- Method doesn't work
            arbitrary = 'data2'
        }

        // Both cases work
        "/three"(controller: 'example', action: 'get3', method: 'GET')
        "/three"(controller: 'example', action: 'post3', method: 'POST')

        // Define "method" as an arbitraty variable doesn't work
        "/four"(controller: 'example', action: 'get4') {
            method = 'GET'
        }
        "/four"(controller: 'example', action: 'post4') {
            method = 'POST'
        }

        // Both cases work
        get "/five"(controller: 'example', action: 'get5')
        post "/five"(controller: 'example', action: 'post5')

        // Params are empty in both cases
        get "/six"(controller: 'example', action: 'get6') {
            arbitrary = 'data6 - get'
        }
        post "/six"(controller: 'example', action: 'post6') {
            arbitrary = 'data6 - post'
        }

        // Define "method" as an arbitraty variable doesn't work
        "/seven" {
            controller = 'example'
            action = 'get7'
            method = 'GET'
        }
        "/seven" {
            controller = 'example'
            action = 'post7'
            method = 'POST'
        }
    }
}
