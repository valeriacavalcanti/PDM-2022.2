//
//  Selecao.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import Foundation

class Selecao: NSObject, Identifiable{
    var nome: String
    var nota: Int
    
    override var description: String{
        return "\(nome) - \(nota)"
    }
    
    init(nome: String, nota: Int) {
        self.nome = nome
        self.nota = nota
    }
}
