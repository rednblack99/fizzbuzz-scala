class FizzBuzzTest extends org.scalatest.FunSuite {
  test("FizzBuzz returns number passed to it") {
    assert(FizzBuzz.play(1) === 1)
  }

  test("Fizzbuzz returns fizz when passed multiple of 3") {
    assert(FizzBuzz.play(3) === "Fizz")
  }
}
