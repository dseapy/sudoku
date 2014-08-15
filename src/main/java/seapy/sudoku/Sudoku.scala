package seapy.sudoku

object Sudoku {

  def main(args: Array[String]) {
    val board = Board(Seq(Seq(5,3,0,0,7,0,0,0,0),
                      Seq(6,0,0,1,9,5,0,0,0),
                      Seq(0,9,8,0,0,0,0,6,0),
                      Seq(8,0,0,0,6,0,0,0,3),
                      Seq(4,0,0,8,0,3,0,0,1),
                      Seq(7,0,0,0,2,0,0,0,6),
                      Seq(0,6,0,0,0,0,2,8,0),
                      Seq(0,0,0,4,1,9,0,0,5),
                      Seq(0,0,0,0,8,0,0,7,9)))
    board.changeableBoard.printBoard()
    println("_________________________________________________")
    board.printBoard()
  }

  def checkBoard(board: Seq[Seq[Int]]): Boolean = ???

}

case class Board(b: Seq[Seq[Int]]){

  def changeableBoard: Board = Board(b.map(_.map(e => if(e > 0) 0 else 1)))

  def printBoard() {
    println(b.map(_.mkString(" ")).mkString("\n"))
  }

}

