package id.ac.polbeng.adelia.test_kelas

import java.text.NumberFormat
import java.util.*
open class EmployeeD {
    // Use "open" modifier to allow child classes to override this property
    open val baseSalary: Int = 3000000
}
class Programmer : EmployeeD() {
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 5000000
}
class SoftwareEngineer : EmployeeD() {
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 6000000
}
class ProjectManager : EmployeeD() {
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 8000000
}
fun toRupiahFormat(baseSalary: Int) : String{
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}
fun main() {
    val employee = EmployeeD()
    println("Rata-rata gaji ${employee.javaClass.simpleName} = ${toRupiahFormat(employee.baseSalary)}")
    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")
    val softwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${softwareEngineer.javaClass.simpleName} = ${toRupiahFormat(softwareEngineer.baseSalary)}")
    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} = ${toRupiahFormat(projectManager.baseSalary)}")
}