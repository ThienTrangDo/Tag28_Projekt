class Book (pages: List<Page>, page: Page) {
    var pages: List<Page> = pages
    var page: Page = page


    fun nextPage(){}
    fun previousPage(){}
    fun read(){
        println(page)
    }
}