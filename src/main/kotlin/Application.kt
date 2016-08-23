class Application {
    fun doExecute(model: DataModel){
        model.id = 1
        model.description = "hoge"
    }
}

fun main(args: Array<String>) {
    val app = Application()
    app.doExecute(DataModel())
}