package controllers

import play.mvc.Controller
import play.mvc.Result
import services.Service
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletableFuture.completedFuture
import javax.inject.Inject

class Controller @Inject constructor(val greeter: Service) : Controller() {

    fun greet(name: String): CompletableFuture<Result> {
        return completedFuture(greeter.greet(Utils.quote(name)))
                .thenApply { ok(it) }
    }
}