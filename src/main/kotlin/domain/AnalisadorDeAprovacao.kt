package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    private lateinit var criterioDeAprovacao: CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao){
        this.criterioDeAprovacao = criterio
    }
    
    fun fechaBoletim(boletim: Boletim): BoletimFechado{
        
        val boletimFechado = BoletimFechado(
            boletim.mediaEPs,
            boletim.mediaMiniEPs,
            criterioDeAprovacao.mediaFinal(boletim),
            criterioDeAprovacao.estaAprovado(boletim)
        )

        return boletimFechado

    }
}