object FizzBuzz extends App {
  def play(number: Int) = {
    if (number % 3 == 0 && number % 5 == 0) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"
    else number
  }

  def calc_results(number: Int) = {
    var x = 1
    var to_return = ""
    while (x <= number) {
      to_return = to_return + "\n" + FizzBuzz.play(x)
      x = x + 1;
    }
    to_return  
  }

  def up_to(number: Int) = {
    println(FizzBuzz.calc_results(number))
  }
}