object Application extends App {
    println("One lineee!")
    val counter = new Counter();
    counter.increment();
    counter.increment();
    println(counter.status())
}