import java.time.format.{DateTimeFormatter, FormatStyle}
import java.time.LocalDate
import java.util.Locale._

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = LocalDate.now
    val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(FRANCE)
    println(df.format(now))

    val a = Array(1, 2, 3, 4, 5)
    for {
         e <- a if e > 2
    } yield e
    println(e)
  }
}
