object Q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val squaredNumbers = calculateSquare(numbers)
    println(squaredNumbers) 
  }
}
