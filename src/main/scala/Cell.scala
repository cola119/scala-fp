class Cell[T](var value: T) {
  def put(newVal: T): Unit = {
    value = newVal
  }

  def get(): T = value
}