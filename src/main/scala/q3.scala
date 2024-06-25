object salaryCalculator{

    def calcualteSalary(normal:Int, ot:Int):Double = {
        250*normal + 85*ot
    }

    def calculateTax(salary:Double): Double={
        salary*0.12
    }

    def takeHomeSalary(normal:Int, ot:Int):Double = {
        val salary = calcualteSalary(normal,ot)
        val tax = calculateTax(salary)
        salary-tax
    }

    def main(args: Array[String]):Unit = {
    val takeHome = takeHomeSalary(40, 30)
    println(takeHome)
  }

}