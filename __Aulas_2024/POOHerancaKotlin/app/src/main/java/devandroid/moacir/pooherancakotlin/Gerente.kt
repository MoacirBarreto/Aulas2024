package devandroid.moacir.pooherancakotlin

class Gerente : Funcionario() {

    private var comissao: Double? = null
    private var totalFuncionario: Int? = null

    fun getComissao(): Double{
        return comissao!!
    }
    fun setComissao(nome: Double?){
        this.comissao = comissao
    }
    fun getTotalFuncionario(): Int{
        return totalFuncionario!!
    }
    fun setTotalFuncionario(nome: Int?){
        this.totalFuncionario = totalFuncionario
    }


}