package issue10855

class ExampleController {

    def one() {
        render "$params - one"
    }

    def two() {
        render "$params - two"
    }

    def get3() {
        render 'get3'
    }

    def post3() {
        render 'post3'
    }

    def get4() {
        render 'get4'
    }

    def post4() {
        render 'post4'
    }

    def get5() {
        render 'get5'
    }

    def post5() {
        render 'post5'
    }

    def get6() {
        render "$params - get6"
    }

    def post6() {
        render "$params - post6"
    }
}
