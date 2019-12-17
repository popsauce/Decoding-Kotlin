fun main(args: Array<String>){
    val l = readLine()!!.trim().split("\\s+".toRegex()).map (String::toFloat)
    val n = l.get(0)
    val m = l.get(1)
    val a = l.get(2)
    /* 
    print(n)
    print(m)
    print(a)
    */

    val d = n/a
    val dda = d.toInt()

    val c = m/a
    val cca = c.toInt()

    val zero:Float= 0F

    if (n%a==zero){
        if (m%a==zero){
            print(dda*cca)
        } else {
            print(dda*(cca+1))
        }
    } else {
        if (m%a==zero){
            print((dda+1)*cca)
        } else {
            print((dda+1)*(cca+1))
        }
    }    

}