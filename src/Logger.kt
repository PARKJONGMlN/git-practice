package src

object Logger {

    fun i(message:String){
        println("Log info : $message")
    }

    fun e(errorMessage: String){
        println("Log Error : $errorMessage")
    }
}